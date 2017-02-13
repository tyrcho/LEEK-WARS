package com.leekwars.utils.io;

import com.leekwars.utils.model.Fight;
import com.leekwars.utils.model.SimpleJSONResponse;
import lombok.*;

/**
 * Informations sur un combat suite à un appel à "fight/get".
 * @author Bezout
 */
@Data
public class GetFightJSONResponse extends SimpleJSONResponse {
	private Fight fight;

}
