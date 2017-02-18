package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'une équipe
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Team extends Entity {
	private long xp;
	private long up_xp;
	private long down_xp;
	private int remaining_xp;
	private int victories;
	private int draws;
	private int defeats;
	private long emblem_changed;
	private String description;
	private double ratio;
	private int member_count;
	private TeamMember[] members;
	private int leek_count;
	private boolean opened;
	private LeekSummary[] leeks;
	private boolean candidacy;

}
