package com.thevortex.bettercompat.registry;

import com.thevortex.bettercompat.ref.Reference;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Reference.MOD_ID);
    
	public static final RegistryObject<Item> THALLASIUM_BUCKET = ITEMS.register("thallasium_bucket", 
			() -> new BucketItem(FluidReg.THALLASIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> TERMINITE_BUCKET = ITEMS.register("terminite_bucket", 
			() -> new BucketItem(FluidReg.TERMINITE,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> AETERNIUM_BUCKET = ITEMS.register("aeternium_bucket", 
			() -> new BucketItem(FluidReg.AETERNIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
}
