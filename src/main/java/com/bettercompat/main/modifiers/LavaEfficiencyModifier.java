package com.bettercompat.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;

public class LavaEfficiencyModifier extends Modifier {

	public LavaEfficiencyModifier() {
		super(0xF56801);
	}
	
	@Override
	public float getEntityDamage(IModifierToolStack tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		if(context.getAttacker().isEyeInFluid(FluidTags.LAVA)) {
			return super.getEntityDamage(tool, level, context, baseDamage, damage) * 2.0f;
		}
		if(context.getTarget().isEyeInFluid(FluidTags.LAVA)) {
			return super.getEntityDamage(tool, level, context, baseDamage, damage) * 2.0f;
		}
		return super.getEntityDamage(tool, level, context, baseDamage, damage);	
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective && event.getEntityLiving().isEyeInFluid(FluidTags.LAVA)) {
			event.setNewSpeed(event.getNewSpeed() * 2.0f);
		}
	}
}
