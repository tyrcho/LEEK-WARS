package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations minimales sur un combat.
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FightSummary extends Identity {
	// "id":15435057,"date":1451254810,"type":1,"context":2,"status":1,"winner":1,"farmer_team":1,"result":"win","farmer1":16748,"farmer2":8750,"farmer1_name":"Bezout","farmer2_name":"vinc"
	private long date;
	private int type;
	private int context;
	private int status; // 0=en cours, 1=terminé
	private int winner;
	private int farmer_team;
	private String result;
	
	private long farmer1;
	private long farmer2;
	
	private long team1;
	private long team2;
	
	private String farmer1_name;
	private String farmer2_name;

}
