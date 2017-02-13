package com.leekwars.utils.io;

import com.leekwars.utils.model.SimpleJSONResponse;
import lombok.*;

/**
 * Informations recues si l'on demande un classement
 * @since 1.2
 * @author Bezout
 */
@Data
public class GetRankJSONResponse extends SimpleJSONResponse {
    private long rank;

}
