package com.leekwars.utils.io;

import com.leekwars.utils.model.Farmer;
import com.leekwars.utils.model.SimpleJSONResponse;

/**
 * Informations recues suite à un appel à "farmer/get".
 * @author Bezout
 */
@lombok.Data
public class GetFarmerJSONResponse extends SimpleJSONResponse {
	private Farmer farmer;

}
