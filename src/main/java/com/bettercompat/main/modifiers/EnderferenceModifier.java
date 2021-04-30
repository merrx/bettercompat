package com.bettercompat.main.modifiers;

import com.bettercompat.main.init.EffectInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.potion.EffectInstance;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EnderferenceModifier extends Modifier {
	
	public EnderferenceModifier() {
		super(0x105A4B);
	}
	
	@Override
	public float applyLivingDamage(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float baseDamage, float damage, boolean isCritical, boolean fullyCharged) {
		int effectLevel = EffectInit.ENDERFERENCE.get().getLevel(attacker);
		return damage + level * effectLevel / -3f;
	}
	
	@Override
	public int afterLivingHit(IModifierToolStack tool, int level, LivingEntity attacker, LivingEntity target, float damageDealt, boolean isCritical, boolean fullyCharged) {
		int effectLevel = Math.min(8, EffectInit.ENDERFERENCE.get().getLevel(attacker) + 1);
		if (target instanceof EndermanEntity) {
				target.addEffect(new EffectInstance(EffectInit.ENDERFERENCE.get(), 400, effectLevel));
		}
		return 0;
	}
}
