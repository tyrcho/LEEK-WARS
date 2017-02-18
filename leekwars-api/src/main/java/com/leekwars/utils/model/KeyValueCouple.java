package com.leekwars.utils.model;

import com.leekwars.utils.exceptions.LWException;

import lombok.Data;

/**
 * Représente un couple clef/valeur, par exemple un registre
 * @author Bezout
 */
@Data
public class KeyValueCouple {
	private String key;
	private String value;


	/**
	 * @throws LWException si non conforme à la règle des registres
	 */
	public void validate() throws LWException {
		if (key == null || key.isEmpty()) {
			throw new LWException("key is null or empty");
		}
		if (value == null || value.isEmpty()) {
			throw new LWException("value is null or empty");
		}
	}
	/**
	 * @throws LWException si non conforme à la règle des registres
	 */
	public void validateForRegister() throws LWException {
		// Validation de base
		validate();
		// REGLE POUR LES REGISTRES : 
		//	- La clé, chaîne qui doit contenir 100 caractères au maximum
		//	- La valeur, chaîne qui doit contenir 5000 caractères au maximum
		if (key.length() > 100) {
			throw new LWException("key's length is greater than 100 characters");
		}
		if (value.length() > 5000) {
			throw new LWException("value's length is greater than 5 000 characters");
		}
	}
}
