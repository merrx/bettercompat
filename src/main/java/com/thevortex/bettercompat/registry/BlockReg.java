package com.thevortex.bettercompat.registry;

import com.thevortex.bettercompat.ref.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Reference.MOD_ID);
    
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_THALLASIUM = BLOCKS
            .register("molten_thallasium_block", () -> new FlowingFluidBlock(FluidReg.THALLASIUM,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERMINITE = BLOCKS
            .register("molten_terminite_block", () -> new FlowingFluidBlock(FluidReg.TERMINITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AETERNIUM = BLOCKS
            .register("molten_aeternium_block", () -> new FlowingFluidBlock(FluidReg.AETERNIUM,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));

}
