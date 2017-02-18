package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'une composition d'équipe
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamComposition extends Entity {
	private int total_level;
	private LeekSummary[] leeks;
	private TeamTournament tournament;
	private LeekSummary[] unengaged_leeks;
	private long id; // ajout bezout (pas dans le JSON)
	
	
}
