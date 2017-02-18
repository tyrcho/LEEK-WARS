package com.leekwars.utils.io;

import com.leekwars.utils.model.Fight;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations sur un combat suite à un appel à "fight/get".
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetFightJSONResponse extends SimpleJSONResponse {
	private Fight fight;

}
