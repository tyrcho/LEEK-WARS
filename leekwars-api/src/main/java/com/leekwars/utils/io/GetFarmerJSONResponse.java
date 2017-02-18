package com.leekwars.utils.io;

import com.leekwars.utils.model.Farmer;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations recues suite à un appel à "farmer/get".
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetFarmerJSONResponse extends SimpleJSONResponse {
	private Farmer farmer;

}
