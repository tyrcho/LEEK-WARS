package com.leekwars.utils.model;

import lombok.Data;

/**
 * Classe générique pour stocker n'importe quel objet identifiable (nom + id), nom étant optionnel.
 * @author Bezout
 */
@Data
public class Identity {
	private long id;
	private String name;
	
	/**
	 * Constructeur
	 */
	public Identity() {
		super();
	}
	/**
	 * Constructeur avec parametres
	 * @param pId
	 * @param pName
	 */
	public Identity(long pId, String pName) {
		id= pId;
		name = pName;
	}

}
