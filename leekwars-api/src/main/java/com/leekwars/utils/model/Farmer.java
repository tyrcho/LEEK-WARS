package com.leekwars.utils.model;

import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'un éleveur
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Farmer extends Entity {
	private String login;
	private TeamSummary team;
	private Map<String, LeekSummary> leeks;
	private long avatar_changed;
	private int talent_more;
	// avant LW 1.94 private FightSummary[] fights;
	private long fights; // depuis LW 1.94 - nombre total de combats restant
	private int victories;
	private int draws;
	private int defeats;
	private double ratio;
	private boolean connected;
	private long last_connection;
	private long register_date;
	private Tournament[] tournaments;
	private boolean admin;
	private boolean moderator;
	private String country;
	private Identity godfather;
	private Identity[] godsons;
	private String color;
	private int banned;
	private int won_solo_tournaments;
	private int won_farmer_tournaments;
	private int won_team_tournaments;
	private long habs;
	private int crystals;
	private TemplatedItem[] weapons;
	private TemplatedItem[] chips;
	private AI[] ais;
	private Potion[] potions;
	private Hat[] hats;
	private DailyTournament tournament;
	//private Fight[] fight_history
	private int in_garden; // since 1.3.0
	private int total_level; // since 1.3.0
	private int leek_count; // since 1.3.0

	/** getLeekFromId
	 * @param pId
	 * @return LeekSummary
	 */
	public LeekSummary getLeekFromId(final long pId) {
		return leeks.get(String.valueOf(pId));
	}

	/**
	 * @return
	 * @since 1.4.0
	 */
	public boolean isInGarden() {
		return in_garden == 1;
	}

}
