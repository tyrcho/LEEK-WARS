package com.leekwars.utils.io;

import com.leekwars.utils.model.GardenEnemyTeamComposition;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations du potager suite à un appel à "garden/get-composition-opponents"
 * @author Bezout
 * @version 1.1
 * @since 1.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetTeamOpponentsJSONResponse extends SimpleJSONResponse {
    private GardenEnemyTeamComposition[] opponents;

}
