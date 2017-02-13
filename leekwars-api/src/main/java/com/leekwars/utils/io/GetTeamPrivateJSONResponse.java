package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;
import com.leekwars.utils.model.TeamPrivate;
import lombok.*;

/**
 * Informations recues suite à un appel à "team/get-private".
 * @author Bezout
 */
@Data
public class GetTeamPrivateJSONResponse extends SimpleJSONResponse {
	private TeamPrivate team;

}
