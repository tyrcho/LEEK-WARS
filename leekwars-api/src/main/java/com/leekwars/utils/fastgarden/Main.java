package com.leekwars.utils.fastgarden;

import static javax.swing.JOptionPane.OK_OPTION;
import static javax.swing.JOptionPane.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPasswordField;

import com.leekwars.utils.DefaultLeekWarsConnector;
import com.leekwars.utils.exceptions.LWException;
import com.leekwars.utils.model.Entity;
import com.leekwars.utils.model.FarmerSummary;
import com.leekwars.utils.model.Garden;
import javaslang.collection.List;

public class Main {
    private static final String TIMESTAMP = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());

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
        List<FarmerSummary> opponents = List.of(connector.getFarmerOpponents());
        Integer minTalent = opponents.map(Entity::getTalent).min().get();
        Integer maxTalent = opponents.map(Entity::getTalent).max().get();
        opponents.sortBy(Entity::getTalent).drop(1).headOption()
                .forEach(opponent -> {
                            try {
                                long fight = connector.startFarmerFight(opponent.getId());
                                System.out.println("Starting fight with " + opponent.getName());
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                );
        garden = connector.getGarden();
        System.out.println(garden);
        return garden.getFights();
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
