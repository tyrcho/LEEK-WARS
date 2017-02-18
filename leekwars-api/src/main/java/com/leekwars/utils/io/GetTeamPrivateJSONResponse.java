package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;
import com.leekwars.utils.model.TeamPrivate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations recues suite à un appel à "team/get-private".
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetTeamPrivateJSONResponse extends SimpleJSONResponse {
	private TeamPrivate team;

}
