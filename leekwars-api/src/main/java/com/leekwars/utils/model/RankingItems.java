package com.leekwars.utils.model;

import lombok.*;

/**
 * Objet intermédiaire qui contient les items d'un des classements FUN
 * @author Bezout
 * @since 1.2
 */
@Data
public class RankingItems {
    private RankingItem[] ranking;
    private int farmer_rank;
    private long farmer_value;



}
