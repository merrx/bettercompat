package com.bettercompat.main;

import com.bettercompat.main.registry.BlockReg;
import com.bettercompat.main.registry.FluidReg;
import com.bettercompat.main.registry.ItemReg;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterCompat.MODID)
public class BetterCompat
{
	public static final String MODID = "bettercompat";
	
    public BetterCompat() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FluidReg.FLUIDS.register(modEventBus);
        BlockReg.BLOCKS.register(modEventBus);
        ItemReg.ITEMS.register(modEventBus);
        
    }

}
