package com.leekwars.utils.model;

import lombok.*;

/**
 * Infos d'une composition d'équipe de l'éleveur dans le potager
 * @author Bezout
 */
@Data
public class GardenFarmerTeamComposition extends Entity {
	private int total_level;
	private int fights;

}
