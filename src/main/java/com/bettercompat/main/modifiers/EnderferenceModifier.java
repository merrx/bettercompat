package com.bettercompat.main.modifiers;

import com.bettercompat.main.init.EffectInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.potion.EffectInstance;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EnderferenceModifier extends Modifier {
	
	public EnderferenceModifier() {
		super(0x105A4B);
	}
	
	@Override
	public float getEntityDamage(IModifierToolStack tool, int level, ToolAttackContext context, float baseDamage, float damage) {
		int effectLevel = EffectInit.ENDERFERENCE.get().getLevel(context.getAttacker());
		return damage + level * effectLevel / -3f;
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		int effectLevel = Math.min(8, EffectInit.ENDERFERENCE.get().getLevel(context.getAttacker()) + 1);
		if (context.getTarget() instanceof EndermanEntity) {
			((EndermanEntity) context.getTarget()).addEffect(new EffectInstance(EffectInit.ENDERFERENCE.get(), 400, effectLevel));
		}
		return 0;
	}
}
