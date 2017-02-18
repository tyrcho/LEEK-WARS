package com.leekwars.utils.model;

import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations sur un combat.
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Fight extends Identity {
	private long date;
	private int type;
	private int context;
	private int status; // 0=en cours, 1=terminé
	private int winner;
	
	private LeekSummary[] leeks1;
	private LeekSummary[] leeks2;
	
	private Map<String, Identity> farmers1;
	private Map<String, Identity> farmers2;
	
	private long team1;
	private long team2;
	private String team1_name;
	private String team2_name;
	
	private String[] comments;
	private FightReport report;
	
	private long tournament;

}
