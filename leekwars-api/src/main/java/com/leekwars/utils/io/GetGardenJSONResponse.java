package com.leekwars.utils.io;

import com.leekwars.utils.model.Garden;
import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations du potager suite à un appel à "garden/get"
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetGardenJSONResponse extends SimpleJSONResponse {
	private Garden garden;

}
