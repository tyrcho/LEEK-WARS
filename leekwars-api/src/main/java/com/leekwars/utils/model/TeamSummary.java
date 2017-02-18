package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos minimales d'une equipe
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamSummary extends Identity {
	private int level;
	private long emblem_changed;

}
