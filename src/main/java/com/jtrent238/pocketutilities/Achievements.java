package com.jtrent238.pocketutilities;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {
    
	public static Achievement achievementCraftWorkbench;
	public static Achievement achievementCraftFurnace;
	public static Achievement achievementCraftAnvil;
    

    
  
    
   
    
    public static void loadAchievements()
    {
    	achievementCraftWorkbench = new Achievement("achievement." + PocketUtilities.MODID + ".CraftWorkbench", "CraftWorkbench", 0, 0, new ItemStack(ItemLoader.ItemPocketWorkBench, 1), (Achievement)achievementCraftWorkbench).initIndependentStat().registerStat();
    	achievementCraftFurnace = new Achievement("achievement." + PocketUtilities.MODID + ".CraftFurnace", "CraftFurnace", 0, 1, new ItemStack(ItemLoader.ItemPocketFurnace, 1), (Achievement)achievementCraftFurnace).initIndependentStat().registerStat();
    	achievementCraftAnvil = new Achievement("achievement." + PocketUtilities.MODID + ".CraftAnvil", "CraftAnvil", 0, 2, new ItemStack(ItemLoader.ItemPocketAnvil, 1), (Achievement)achievementCraftAnvil).initIndependentStat().registerStat();
    	
    	
    	AchievementPage.registerAchievementPage(new AchievementPage(PocketUtilities.MODID + PocketUtilities.MODVERSION + "Achievements", new Achievement[]{
    			achievementCraftWorkbench,
    			achievementCraftFurnace,
    			achievementCraftAnvil
    			}));

    }
    
    
}
