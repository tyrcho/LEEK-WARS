package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'un chapeau de poireau
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Hat extends TemplatedItem {
	private int level;
	private int hat_template;

}
