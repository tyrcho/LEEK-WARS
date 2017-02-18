package com.leekwars.utils.model;

import lombok.Data;

/**
 * Réponse JSO minimal
 * @author Bezout
 */
@Data
public class SimpleJSONResponse {

	private boolean success;
	private String error;

}
