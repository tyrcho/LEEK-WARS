package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Classe générique pour un élément basé sur un template
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TemplatedItem extends Identity {
	private int template;

}
