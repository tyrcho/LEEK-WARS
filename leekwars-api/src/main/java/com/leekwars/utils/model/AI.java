package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'une IA
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AI extends Identity {
	private int level;

}
