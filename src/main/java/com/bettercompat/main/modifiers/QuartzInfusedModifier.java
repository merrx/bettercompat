package com.bettercompat.main.modifiers;

import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;

public class QuartzInfusedModifier extends Modifier {

	public QuartzInfusedModifier() {
		super(0xDFEDFB);

	}
	
	@Override
	public void addToolStats(ToolDefinition toolDefine, StatsNBT baseStats, IModDataReadOnly persistentData, IModDataReadOnly volatileData, int level, ModifierStatsBuilder builder) {
		builder.multiplyAttackDamage(1 + (level * 0.1f));
	}
}
