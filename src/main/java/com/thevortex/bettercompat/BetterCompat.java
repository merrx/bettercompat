package com.thevortex.bettercompat;

import com.thevortex.bettercompat.ref.Reference;
import com.thevortex.bettercompat.registry.RegistryData;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class BetterCompat
{
    private static final Logger LOGGER = LogManager.getLogger();

    public BetterCompat() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryData.FLUIDS.register(modEventBus);
    }


}
