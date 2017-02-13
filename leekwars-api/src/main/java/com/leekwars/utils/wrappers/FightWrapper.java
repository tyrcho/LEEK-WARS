package com.leekwars.utils.wrappers;

import com.leekwars.utils.enums.EntityType;
import com.leekwars.utils.model.Entity;
import lombok.*;

/**
 * Wrapper pour infos réduites d'un combat.
 * @author Bezout
 */
@Data
public class FightWrapper {
	private long fightId;
	private EntityType entityType = EntityType.LEEK;
	private Entity entity;
	private String fightResult;
	private String fightType;
	private String enemyName;
	private int turnCount;

	public FightWrapper(final Entity pEntity, final String pFightType, final long pId, final String pEnemyName) {
		fightId = pId;
		entity = pEntity;
		fightType = pFightType;
		enemyName = pEnemyName;
	}

}
