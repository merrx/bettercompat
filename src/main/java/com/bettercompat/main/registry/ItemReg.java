package com.bettercompat.main.registry;

import com.bettercompat.main.BetterCompat;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BetterCompat.MODID);
    
    //better end
	public static final RegistryObject<Item> THALLASIUM_BUCKET = ITEMS.register("thallasium_bucket", 
			() -> new BucketItem(FluidReg.THALLASIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> TERMINITE_BUCKET = ITEMS.register("terminite_bucket", 
			() -> new BucketItem(FluidReg.TERMINITE,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> AETERNIUM_BUCKET = ITEMS.register("aeternium_bucket", 
			() -> new BucketItem(FluidReg.AETERNIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//ores above diamonds
	public static final RegistryObject<Item> AMETHYST_BUCKET = ITEMS.register("amethyst_bucket", 
			() -> new BucketItem(FluidReg.AMETHYST,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> BLACKOPAL_BUCKET = ITEMS.register("blackopal_bucket", 
			() -> new BucketItem(FluidReg.BLACKOPAL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> NETHERITEOPAL_BUCKET = ITEMS.register("netheriteopal_bucket", 
			() -> new BucketItem(FluidReg.NETHERITEOPAL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//endreborn
	public static final RegistryObject<Item> ENDORIUM_BUCKET = ITEMS.register("endorium_bucket", 
			() -> new BucketItem(FluidReg.ENDORIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//druidcraft
	public static final RegistryObject<Item> MOONSTONE_BUCKET = ITEMS.register("moonstone_bucket", 
			() -> new BucketItem(FluidReg.MOONSTONE,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//botania
	public static final RegistryObject<Item> MANASTEEL_BUCKET = ITEMS.register("manasteel_bucket", 
			() -> new BucketItem(FluidReg.MANASTEEL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> ELEMENTIUM_BUCKET = ITEMS.register("elementium_bucket", 
			() -> new BucketItem(FluidReg.ELEMENTIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> TERRASTEEL_BUCKET = ITEMS.register("terrasteel_bucket", 
			() -> new BucketItem(FluidReg.TERRASTEEL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//ae2
	public static final RegistryObject<Item> CERTUS_QUARTZ_BUCKET = ITEMS.register("certus_quartz_bucket",
			() -> new BucketItem(FluidReg.CERTUS_QUARTZ,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> FLUIX_BUCKET = ITEMS.register("fluix_bucket",
			() -> new BucketItem(FluidReg.FLUIX,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//aquaculture
	public static final RegistryObject<Item> NEPTUNIUM_BUCKET = ITEMS.register("neptunium_bucket",
			() -> new BucketItem(FluidReg.NEPTUNIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
}
