package com.leekwars.utils.model;

import lombok.*;

/**
 * Infos minimales d'une equipe
 * @author Bezout
 */
@Data
public class TeamSummary extends Identity {
	private int level;
	private long emblem_changed;

}
