package com.bettercompat.main.registry;

import com.bettercompat.main.BetterCompat;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidReg {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            BetterCompat.MODID);

    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(BetterCompat.MODID,
            "blocks/fluids/molten_metal_still");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(BetterCompat.MODID,
            "blocks/fluids/molten_metal_flowing");

    
    //materials
    	//better end
    public static final RegistryObject<ForgeFlowingFluid.Source> THALLASIUM = FLUIDS.register("molten_thallasium",
            () -> new ForgeFlowingFluid.Source(makeMoltenThallasiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_THALLASIUM = FLUIDS.register("flowing_molten_thallasium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenThallasiumProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> TERMINITE = FLUIDS.register("molten_terminite",
            () -> new ForgeFlowingFluid.Source(makeMoltenTerminiteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TERMINITE = FLUIDS.register("flowing_molten_terminite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTerminiteProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> AETERNIUM = FLUIDS.register("molten_aeternium",
            () -> new ForgeFlowingFluid.Source(makeMoltenAeterniumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AETERNIUM = FLUIDS.register("flowing_molten_aeternium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAeterniumProperties()));
    
    	//ores above diamonds
    public static final RegistryObject<ForgeFlowingFluid.Source> AMETHYST = FLUIDS.register("molten_amethyst",
            () -> new ForgeFlowingFluid.Source(makeMoltenAmethystProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AMETHYST = FLUIDS.register("flowing_molten_amethyst",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAmethystProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> BLACKOPAL = FLUIDS.register("molten_blackopal",
            () -> new ForgeFlowingFluid.Source(makeMoltenBlackOpalProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_BLACKOPAL = FLUIDS.register("flowing_molten_blackopal",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenBlackOpalProperties()));
    
    public static final RegistryObject<ForgeFlowingFluid.Source> NETHERITEOPAL = FLUIDS.register("molten_netheriteopal",
            () -> new ForgeFlowingFluid.Source(makeMoltenNetheriteOpalProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_NETHERITEOPAL = FLUIDS.register("flowing_molten_netheriteopal",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenNetheriteOpalProperties()));
    
    	//endreborn
    public static final RegistryObject<ForgeFlowingFluid.Source> ENDORIUM = FLUIDS.register("molten_endorium",
            () -> new ForgeFlowingFluid.Source(makeMoltenEndoriumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ENDORIUM = FLUIDS.register("flowing_molten_endorium",
    		() -> new ForgeFlowingFluid.Flowing(makeMoltenEndoriumProperties()));
    
    	//druidcraft
    public static final RegistryObject<ForgeFlowingFluid.Source> MOONSTONE = FLUIDS.register("molten_moonstone",
            () -> new ForgeFlowingFluid.Source(makeMoltenMoonstoneProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_MOONSTONE = FLUIDS.register("flowing_molten_moonstone",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenMoonstoneProperties()));
    
    
    //molten material properties
    	//better end
    private static ForgeFlowingFluid.Properties makeMoltenThallasiumProperties() {
        return new ForgeFlowingFluid.Properties(THALLASIUM, flowing_THALLASIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF79CFD2)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
        		.bucket(ItemReg.THALLASIUM_BUCKET).block(BlockReg.MOLTEN_THALLASIUM).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenTerminiteProperties() {
        return new ForgeFlowingFluid.Properties(TERMINITE, flowing_TERMINITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF34C8BD)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.TERMINITE_BUCKET).block(BlockReg.MOLTEN_TERMINITE).explosionResistance(1000F).tickRate(9);
    }

    private static ForgeFlowingFluid.Properties makeMoltenAeterniumProperties() {
        return new ForgeFlowingFluid.Properties(AETERNIUM, flowing_AETERNIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF6B807F)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.AETERNIUM_BUCKET).block(BlockReg.MOLTEN_AETERNIUM).explosionResistance(1000F).tickRate(9);
    }
    
    	//ores above diamonds
    private static ForgeFlowingFluid.Properties makeMoltenAmethystProperties() {
        return new ForgeFlowingFluid.Properties(AMETHYST, flowing_AMETHYST,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFFB859CB)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.AMETHYST_BUCKET).block(BlockReg.MOLTEN_AMETHYST).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeMoltenBlackOpalProperties() {
        return new ForgeFlowingFluid.Properties(BLACKOPAL, flowing_BLACKOPAL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF130935)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.BLACKOPAL_BUCKET).block(BlockReg.MOLTEN_BLACKOPAL).explosionResistance(1000F).tickRate(9);
    }
    
    private static ForgeFlowingFluid.Properties makeMoltenNetheriteOpalProperties() {
        return new ForgeFlowingFluid.Properties(NETHERITEOPAL, flowing_NETHERITEOPAL,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF000017)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1500).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.NETHERITEOPAL_BUCKET).block(BlockReg.MOLTEN_NETHERITEOPAL).explosionResistance(1000F).tickRate(9);
    }
    
    	//endreborn
    private static ForgeFlowingFluid.Properties makeMoltenEndoriumProperties() {
        return new ForgeFlowingFluid.Properties(ENDORIUM, flowing_ENDORIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF105A4B)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.ENDORIUM_BUCKET).block(BlockReg.MOLTEN_ENDORIUM).explosionResistance(1000F).tickRate(9);
    }
    
    	//druidcraft
    private static ForgeFlowingFluid.Properties makeMoltenMoonstoneProperties() {
        return new ForgeFlowingFluid.Properties(MOONSTONE, flowing_MOONSTONE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF6EB2EA)
                        .luminosity(15).density(3000).viscosity(6000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
                .bucket(ItemReg.MOONSTONE_BUCKET).block(BlockReg.MOLTEN_MOONSTONE).explosionResistance(1000F).tickRate(9);
    }
}
