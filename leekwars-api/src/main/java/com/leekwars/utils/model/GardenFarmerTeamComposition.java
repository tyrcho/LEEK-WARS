package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'une composition d'équipe de l'éleveur dans le potager
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GardenFarmerTeamComposition extends Entity {
	private int total_level;
	private int fights;

}
