package com.bettercompat.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class LavaEfficiencyModifier extends Modifier {

	public LavaEfficiencyModifier() {
		super(0xF56801);
	}
	
	@Override
	public float applyLivingDamage(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float baseDamage, float damage, boolean isCritical, boolean fullyCharged) {
		if(attacker.isEyeInFluid(FluidTags.LAVA)) {
			return super.applyLivingDamage(tool, level, attacker, target, baseDamage, damage, isCritical, fullyCharged) * 2.0f;
		}
		if(target.isEyeInFluid(FluidTags.LAVA)) {
			return super.applyLivingDamage(tool, level, attacker, target, baseDamage, damage, isCritical, fullyCharged) * 2.0f;
		}
		return super.applyLivingDamage(tool, level, attacker, target, baseDamage, damage, isCritical, fullyCharged);	
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective && event.getEntityLiving().isEyeInFluid(FluidTags.LAVA)) {
			event.setNewSpeed(event.getNewSpeed() * 2.0f);
		}
	}
}
