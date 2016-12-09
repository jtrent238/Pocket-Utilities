package com.jtrent238.pocketutilities;

import com.jtrent238.pocketutilities.items.ItemPocketAnvil;
import com.jtrent238.pocketutilities.items.ItemPocketBaseItem;
import com.jtrent238.pocketutilities.items.ItemPocketFurnace;
import com.jtrent238.pocketutilities.items.ItemPocketWorkBench;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ItemLoader {
	
	public static Item ItemPocketBaseItem;
	public static Item ItemPocketWorkBench;
	public static Item ItemPocketFurnace;
	public static Item ItemPocketAnvil;
	
	/**
	 * Load Items.
	 */
	public static void LoadItems() {
		
		ItemPocketBaseItem = new ItemPocketBaseItem().setUnlocalizedName("ItemPocketBaseItem").setTextureName(PocketUtilities.MODID + ":ItemPocketBaseItem").setCreativeTab(PocketUtilities.pocketutilities);
		ItemPocketWorkBench = new ItemPocketWorkBench().setUnlocalizedName("ItemPocketWorkBench").setTextureName(PocketUtilities.MODID + ":ItemPocketWorkBench").setCreativeTab(PocketUtilities.pocketutilities);
		ItemPocketFurnace = new ItemPocketFurnace().setUnlocalizedName("ItemPocketFurnace").setTextureName(PocketUtilities.MODID + ":ItemPocketFurnace").setCreativeTab(PocketUtilities.pocketutilities);
		ItemPocketAnvil = new ItemPocketAnvil().setUnlocalizedName("ItemPocketAnvil").setTextureName(PocketUtilities.MODID + ":ItemPocketAnvil").setCreativeTab(PocketUtilities.pocketutilities);
		
		registerItems();
	}
	
	/**
	 * Register Items.
	 */
	private static void registerItems(){
		
		GameRegistry.registerItem(ItemPocketBaseItem, ItemPocketBaseItem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPocketWorkBench, ItemPocketWorkBench.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPocketFurnace, ItemPocketFurnace.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPocketAnvil, ItemPocketAnvil.getUnlocalizedName().substring(5));
		
		registerLang();
	}

	private static void registerLang() {
		
		LanguageRegistry.addName(ItemPocketBaseItem, "Pocket Base");
		LanguageRegistry.addName(ItemPocketWorkBench, "Pocket WorkBench");
		LanguageRegistry.addName(ItemPocketFurnace, "Pocket Furnace");
		LanguageRegistry.addName(ItemPocketAnvil, "Pocket Anvil");
		
	}

}
