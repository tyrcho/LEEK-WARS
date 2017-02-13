package com.leekwars.utils.io;

import com.leekwars.utils.model.FunRanking;
import com.leekwars.utils.model.SimpleJSONResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Informations recues suite à un appel à "ranking/fun".
 *
 * @author Bezout
 * @since 1.2
 */
@Data
public class GetFunRankingsJSONResponse extends SimpleJSONResponse {
    private FunRanking[] rankings;
}