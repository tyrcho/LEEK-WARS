package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Porte le numéro du combat lorsque l'on démarre un combat suite à un appel à "garden/start-*-fight".
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StartFightJSONResponse extends SimpleJSONResponse {
	private long fight;

}
