package com.leekwars.utils.io;

import java.util.Map;

import com.leekwars.utils.model.SimpleJSONResponse;
import com.leekwars.utils.model.Trophy;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations recues suite à un appel à "trophy/get-farmer-trophies".
 *
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetFarmerTrophiesJSONResponse extends SimpleJSONResponse {

    private Map<String, Trophy> trophies;
    private int count;
    private int total;
    private String farmer_name;


}

