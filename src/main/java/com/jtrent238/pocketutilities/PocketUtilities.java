package com.jtrent238.pocketutilities;

import java.awt.Frame;
import java.net.MalformedURLException;

import com.jtrent238.pocketutilities.common.CommonProxy;
import com.jtrent238.pocketutilities.util.ConsoleFrame;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

@Mod(modid=PocketUtilities.MODID, name=PocketUtilities.MODNAME, version=(PocketUtilities.MODVERSION))
	public class PocketUtilities
	{

		
		@SidedProxy(clientSide="com.jtrent238.pocketutilities.client.ClientProxy", serverSide="com.jtrent238.pocketutilities.common.CommonProxy")
		public static CommonProxy proxy;
		
		
		public static final String MODID = "pocketutilities";

		@Instance(MODID)
	    public static PocketUtilities instance;
		public static final String MODVERSION = "pre-1.0.0.0";
		public static final String MODNAME = "jtrent238's Pocket Utilities Mod";
		public static final String MODAUTHOR = "jtrent238";
		public static final String MC = "1.7.10";

		
		
		
		@ForgeSubscribe(priority = EventPriority.NORMAL)
	    public void eventHandler(RenderGameOverlayEvent event) {

		}
		
		
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		//ModRegistry.registerMods();
		
	}



	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
		
		
		ItemLoader.LoadItems();
		//BlockLoader.loadBlocks();
		Recipes.registerRecpies();
		//EntityLoader.LoadEntitys();
		//OreDict.addores();
		Achievements.loadAchievements();
		//Stats.RegisterStats();

		//CF.CAS_GUI();
		
			try {
				ConsoleFrame.createAndShowGUI();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		
	}


	public static CreativeTabs pocketutilities = new CreativeTabs("pocketutilities")

	{
		public Item getTabIconItem() {

			return new ItemStack(ItemLoader.ItemPocketWorkBench).getItem();
		}
		public boolean hasSearchBar(){
			return false;
		}
		/*
		@SideOnly(Side.CLIENT)
		public String getBackgroundImageName() 
		{
			return "EpicProportionsMod_Halloween.png";
		}
		
		@SideOnly(Side.CLIENT)
		public boolean drawInForegroundOfTab() 
		{
			return false;
		}
		*/
		}
		
	;









	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		{
			
		    Recipes.registerRecpies();

		    
		}
		
		
	}




						
	}


