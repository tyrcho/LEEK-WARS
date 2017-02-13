package com.leekwars.utils.model;

import com.leekwars.utils.enums.TrophyCategory;
import lombok.*;

/**
 * Infos d'un trophée
 * @author Bezout
 */
@Data
public class Trophy extends Identity {
    private String code;
    private String description;
    private long category;
    private boolean unlocked;
    private long date;
    private String progression;
    private String threshold;

    /**
     * @return true si c'est un trophée bonus (hors classement)
     */
    public boolean isBonus() {
        return category == TrophyCategory.BONUS.getCode();
    }
}
