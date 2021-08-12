package com.bettercompat.main.modifiers;

import net.minecraft.item.Item;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.stat.ModifierStatsBuilder;
import slimeknights.tconstruct.library.tools.ToolDefinition;
import slimeknights.tconstruct.library.tools.nbt.IModDataReadOnly;
import slimeknights.tconstruct.library.tools.nbt.StatsNBT;
import slimeknights.tconstruct.library.tools.stat.ToolStats;

public class QuartzInfusedModifier extends Modifier {

	public QuartzInfusedModifier() {
		super(0xDFEDFB);

	}
	
	@Override
	public void addToolStats(Item item, ToolDefinition toolDefine, StatsNBT baseStats, IModDataReadOnly persistentData, IModDataReadOnly volatileData, int level, ModifierStatsBuilder builder) {
		ToolStats.ATTACK_DAMAGE.multiply(builder, 1 + (level * 0.1f));
	}
}
