package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'un tournoi
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Tournament extends Identity {
	private long date;

}
