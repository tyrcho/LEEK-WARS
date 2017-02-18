package com.leekwars.utils.io;

import com.leekwars.utils.model.KeyValueCouple;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations des registres d'un poireau suite à un appel à "leek/get-registers"
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetRegistersJSONResponse extends SimpleJSONResponse {
	private KeyValueCouple[] registers;

}
