package com.leekwars.utils.io;

import com.leekwars.utils.model.Farmer;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations recues si l'authentification s'est bien déroulée suite à un appel à "farmer/login-token".
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LoginJSONResponse extends SimpleJSONResponse {
	private Farmer farmer;
	private String token;

}
