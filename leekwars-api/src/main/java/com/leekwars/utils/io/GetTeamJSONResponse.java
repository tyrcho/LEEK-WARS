package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;
import com.leekwars.utils.model.Team;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations recues suite à un appel à "team/get".
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetTeamJSONResponse extends SimpleJSONResponse {
	private Team team;

}
