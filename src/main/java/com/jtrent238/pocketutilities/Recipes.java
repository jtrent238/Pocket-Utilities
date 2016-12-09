package com.jtrent238.pocketutilities;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
		addOreRecipes();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPocketBaseItem, 16), "ABZ", "BAZ", "ZZZ", 'A',Blocks.crafting_table, 'B' , Blocks.furnace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPocketWorkBench), "XXX", "XSX", "XXX", 'X',ItemLoader.ItemPocketBaseItem, 'S' , Blocks.crafting_table);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPocketFurnace), "XXX", "XSX", "XXX", 'X',ItemLoader.ItemPocketBaseItem, 'S' , Blocks.furnace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPocketAnvil), "XXX", "XSX", "XXX", 'X',ItemLoader.ItemPocketBaseItem, 'S' , Blocks.anvil);
		
	}
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
	//	GameRegistry.addSmelting(ItemLoader.ItemSandHammer, new ItemStack (ItemLoader.ItemGlassHammer, 1), 2F );
			   }
	
	public static void addOreRecipes()
    {
	//	GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemCopperHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotCopper"}, 'S', Items.stick));

    }
	
	
	}

	
	