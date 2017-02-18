package com.leekwars.utils.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Infos d'un élément d'un des classements FUN
 * @author Bezout
 * @since 1.2
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RankingItem extends Identity {
    private long value;

}
