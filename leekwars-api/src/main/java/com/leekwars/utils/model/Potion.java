package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'une potion
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Potion extends TemplatedItem {
	
	private int quantity;

}
