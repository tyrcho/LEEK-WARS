package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos privées d'une équipe
 * 
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamPrivate extends Team {
	// private FarmerSummary?[] candidacies;
	private long forum;
	private TeamComposition[] compositions;

	/**
	 * Accès direct à une compo du tableau compositions
	 * 
	 * @param pId
	 * @return compo
	 */
	public TeamComposition getComposition(final long pId) {
		if (compositions == null) {
			return null;
		}
		for (TeamComposition lCompo : compositions) {
			if (lCompo.getId() == pId) {
				return lCompo;
			}
		}
		return null;
	}
}
