package com.thevortex.bettercompat.registry;

import com.thevortex.bettercompat.ref.Reference;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryData {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            Reference.MOD_ID);

    public static final ResourceLocation MOLTEN_STILL = new ResourceLocation(Reference.MOD_ID,
            "blocks/fluids/molten_metal_still");
    public static final ResourceLocation MOLTEN_FLOW = new ResourceLocation(Reference.MOD_ID,
            "blocks/fluids/molten_metal_flowing");

    public static final RegistryObject<ForgeFlowingFluid.Source> THALLASIUM = FLUIDS.register("molten_thallasium",
            () -> new ForgeFlowingFluid.Source(makeMoltenThallasiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_THALLASIUM = FLUIDS.register("flowing_molten_thallasium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenThallasiumProperties()));

    private static ForgeFlowingFluid.Properties makeMoltenThallasiumProperties() {
        return new ForgeFlowingFluid.Properties(THALLASIUM, flowing_THALLASIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF79CFD2)
                        .luminosity(15).density(3000).viscosity(3000).temperature(1000));
    }

    public static final RegistryObject<ForgeFlowingFluid.Source> TERMINITE = FLUIDS.register("molten_terminite",
            () -> new ForgeFlowingFluid.Source(makeMoltenTerminiteProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_TERMINITE = FLUIDS.register("flowing_molten_terminite",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenTerminiteProperties()));

    private static ForgeFlowingFluid.Properties makeMoltenTerminiteProperties() {
        return new ForgeFlowingFluid.Properties(TERMINITE, flowing_TERMINITE,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF34C8BD)
                        .luminosity(15).density(3000).viscosity(3000).temperature(1000));
    }

    public static final RegistryObject<ForgeFlowingFluid.Source> AETERNIUM = FLUIDS.register("molten_aeternium",
            () -> new ForgeFlowingFluid.Source(makeMoltenAeterniumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AETERNIUM = FLUIDS.register("flowing_molten_aeternium",
            () -> new ForgeFlowingFluid.Flowing(makeMoltenAeterniumProperties()));

    private static ForgeFlowingFluid.Properties makeMoltenAeterniumProperties() {
        return new ForgeFlowingFluid.Properties(AETERNIUM, flowing_AETERNIUM,
                FluidAttributes.builder(MOLTEN_STILL, MOLTEN_FLOW).overlay(MOLTEN_STILL).color(0xFF6B807F)
                        .luminosity(15).density(3000).viscosity(3000).temperature(1500));
    }
}
