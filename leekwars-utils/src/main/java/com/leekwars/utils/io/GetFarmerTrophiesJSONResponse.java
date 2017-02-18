package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;
import com.leekwars.utils.model.Trophy;

import java.util.Map;

/**
 * Informations recues suite à un appel à "trophy/get-farmer-trophies".
 *
 * @author Bezout
 */
@lombok.Data
public class GetFarmerTrophiesJSONResponse extends SimpleJSONResponse {

    private Map<String, Trophy> trophies;
    private int count;
    private int total;
    private String farmer_name;


}

