package com.leekwars.utils.model;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * Infos du potager [Solo, Eleveur , Equipe]
 * Note : depuis la V1.92 le potager est décomposé : garden/get, garden/get-composition-opponents, garden/get-farmer-challenge/n garden/get-farmer-opponents, garden/get-leek-opponents
 * @author Bezout
 * @version 1.1
 */
@Data
public class Garden {

	// LW_1.94 : Compteur de combat unique : Les compteurs de combat pour chaque type de combat ont été fusionné dans un seul compteur.
	// Seul les combats d'équipe restent à part avec un compteur par poireau comme avant.
	// Chaque jour vous avez donc 50 combats, que vous pouvez utiliser dans le mode de jeu que vous souhaitez
	private int fights; // since LW 1.94
	private int max_fights; // since LW 1.94

	// SOLO
	//private Map<String, Integer> solo_fights;
	private int total_solo_fights;
	private int max_solo_fights;

	// FARMER
	private boolean farmer_enabled;
	//private int farmer_fights;
	//private int farmer_total_fights;
	//private int max_farmer_fights;

	// TEAM
	private boolean team_enabled;
	private int team_fights;
	// private int team_total_fights;
	private int max_team_fights;
	private GardenFarmerTeamComposition[] my_compositions;

	// BATTLE ROYALE (since LW_1.92)
	private boolean battle_royale_enabled;
	private int battle_royale_fights;
	private int max_battle_royale_fights;
	

	/**
	 * Accès direct à une compo du tableau my_compositions
	 * @param pId
	 * @return compo
	 */
	public GardenFarmerTeamComposition getMyComposition(long pId) {
		if (my_compositions == null) {
			return null;
		}
		for (GardenFarmerTeamComposition lCompo : my_compositions) {
			if (lCompo.getId() == pId) {
				return lCompo;
			}
		}
		return null;
	}

}
