package com.bettercompat.main.modifiers.effects;

import net.minecraft.potion.EffectType;
import net.minecraftforge.event.entity.living.EntityTeleportEvent.EnderEntity;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import slimeknights.tconstruct.common.TinkerEffect;

public class EnderferenceEffect extends TinkerEffect {

	public EnderferenceEffect(EffectType effect, boolean show) {
		super(effect, 0x105A4B, show);
	}

	@SubscribeEvent
	public void onEnderTeleport(EnderEntity event) {
		if (this.getLevel(event.getEntityLiving()) > 0) {
			event.setCanceled(true);
			event.isCanceled();
		}
	}

}
