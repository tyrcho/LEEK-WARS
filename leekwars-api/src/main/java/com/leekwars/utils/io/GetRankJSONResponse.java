package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Informations recues si l'on demande un classement
 * @since 1.2
 * @author Bezout
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GetRankJSONResponse extends SimpleJSONResponse {
    private long rank;

}
