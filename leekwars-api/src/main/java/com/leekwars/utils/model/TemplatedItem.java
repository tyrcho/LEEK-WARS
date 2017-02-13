package com.leekwars.utils.model;

import lombok.*;

/**
 * Classe générique pour un élément basé sur un template
 * @author Bezout
 */
@Data
public class TemplatedItem extends Identity {
	private int template;

}
