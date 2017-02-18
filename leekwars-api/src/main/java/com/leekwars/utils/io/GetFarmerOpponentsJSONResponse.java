package com.leekwars.utils.io;

import com.leekwars.utils.model.FarmerSummary;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations du potager suite à un appel à "garden/get-farmer-opponents"
 * @author Bezout
 * @version 1.1
 * @since 1.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetFarmerOpponentsJSONResponse extends SimpleJSONResponse {
    private FarmerSummary[] opponents;

}
