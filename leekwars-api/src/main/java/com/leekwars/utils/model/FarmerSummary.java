package com.leekwars.utils.model;

import lombok.*;

/**
 * Informations minimales d'un éleveur (par exemple dans le potager)
 * @author Bezout
 */
@Data
public class FarmerSummary extends Entity {
	// "id":693,"name":"Foudge","avatar_changed":1403561524,"talent":2198,"total_level":1184,"leek_count":4
	private int total_level;
	private int leek_count;

}
