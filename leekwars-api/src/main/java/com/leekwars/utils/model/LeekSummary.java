package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations minimales d'un poireau
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LeekSummary extends Entity {
	//"id":18906,"name":"CapitaineFlirt","color":"#000000","capital":0,"level":301,"talent":2510,"skin":12,"hat":null
	private String color;
	private int capital;
	private int skin;
	private int hat;

}
