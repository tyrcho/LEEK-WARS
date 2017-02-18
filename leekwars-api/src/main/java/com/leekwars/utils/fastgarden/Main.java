package com.leekwars.utils.fastgarden;

import static com.leekwars.utils.LWUtils.getFightResult;
import static com.leekwars.utils.LWUtils.sleep;
import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JPasswordField;

import com.leekwars.utils.DefaultLeekWarsConnector;
import com.leekwars.utils.enums.FightResult;
import com.leekwars.utils.exceptions.LWException;
import com.leekwars.utils.model.Entity;
import com.leekwars.utils.model.Farmer;
import com.leekwars.utils.model.FarmerSummary;
import com.leekwars.utils.model.Fight;
import com.leekwars.utils.model.Garden;

import javaslang.collection.List;
import javaslang.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
		File lw = extractFromClassPath("lw.jks");
		File jssecacerts = extractFromClassPath("jssecacerts");
		System.setProperty("javax.net.ssl.keyStore", lw.getAbsolutePath());
		System.setProperty("javax.net.ssl.trustStore", jssecacerts.getAbsolutePath());

		DefaultLeekWarsConnector connector = buildConnector();
		while (startFarmerFights(connector) > 50) {
		}
	}

	private static int startFarmerFights(DefaultLeekWarsConnector connector) throws LWException, InterruptedException {
		connector.connectIfNeeded();
		Garden garden = connector.getGarden();
		Farmer farmer = connector.getFarmer();
		List<FarmerSummary> opponents = List.of(connector.getFarmerOpponents());
		opponents.sortBy(Entity::getTalent).drop(2).headOption().forEach(opponent -> {
			try {
				long fight = connector.startFarmerFight(opponent.getId());
				System.out.println("Starting fight " + fight + " with " + opponent.getName());
				fightResult(connector, (int) fight, farmer);
				Thread.sleep(1000);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
		garden = connector.getGarden();
		System.out.println(garden);
		return garden.getFights();
	}

	private static void fightResult(DefaultLeekWarsConnector connector, int fightId, Farmer farmer) {
		Future<FightResult> res = Future.of(() -> {
			return myFightResult(connector, fightId, farmer, 1, 1);
		});
		res.onSuccess(r -> System.out.println("for fight " + fightId + " result is " + r));
	}

	private static FightResult myFightResult(DefaultLeekWarsConnector connector, int fightId, Farmer farmer, int wait,
			int nextWait) throws Exception {
		sleep(wait);
		Fight fight = connector.getFight(fightId);
		FightResult result = getFightResult(farmer, fight);
		if (result != FightResult.UNKNOWN) {
			return result;
		} else {
			System.out.println("wait " + nextWait + "s to get result for fight " + fightId);
			return myFightResult(connector, fightId, farmer, nextWait, wait + nextWait);
		}
	}

	private static DefaultLeekWarsConnector buildConnector() {
		String login = showInputDialog(null, "Enter your LeekWars login");

		JPasswordField passwordField = new JPasswordField();
		if (showConfirmDialog(null, passwordField, "Enter your LeekWars password for " + login, OK_OPTION) != OK_OPTION)
			System.exit(1);

		DefaultLeekWarsConnector connector = new DefaultLeekWarsConnector(login,
				String.valueOf(String.valueOf(passwordField.getPassword())));
		return connector;
	}

	private static File extractFromClassPath(String name) throws IOException {
		File tempFile = File.createTempFile(name, name);
		InputStream inputStream = ClassLoader.getSystemResourceAsStream(name);
		FileOutputStream outputStream = new FileOutputStream(tempFile);
		int read;
		byte[] buffer = new byte[1024];
		while ((read = inputStream.read(buffer)) != -1) {
			outputStream.write(buffer, 0, read);
		}
		outputStream.close();
		return tempFile;
	}

}
