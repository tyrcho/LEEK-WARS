package com.leekwars.utils.model;

import lombok.Data;

/**
 * Infos d'un des classements FUN
 * @author Bezout
 * @since 1.2
 */
@Data
public class FunRanking {
    private String title;
    private String value;
    private String value_type; // money/number/distance => tjs des entiers donc
    private RankingItems ranking;

}
