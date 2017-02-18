package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Classe générique pour stocker les infos d'une entité. (Leek ou Farmer)
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Entity extends Identity {

	private int level = -1; // par pour le l'eleveur
	private int talent;

}
