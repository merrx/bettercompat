package com.bettercompat.main.modifiers;

import javax.annotation.Nullable;

import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class MoonlightModifier extends Modifier {
	
	@Nullable
	protected World world;

	public MoonlightModifier() {
		super(0x6EB2EA);
	}
}
