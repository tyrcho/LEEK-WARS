package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;
import com.leekwars.utils.model.Team;
import lombok.*;

/**
 * Informations recues suite à un appel à "team/get".
 * @author Bezout
 */
@Data
public class GetTeamJSONResponse extends SimpleJSONResponse {
	private Team team;

}
