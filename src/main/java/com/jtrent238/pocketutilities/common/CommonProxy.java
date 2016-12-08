package com.jtrent238.pocketutilities.common;

import com.jtrent238.pocketutilities.PocketUtilities;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {
	
	
	private static final String modid = PocketUtilities.MODID;
	private String owner;

	public void init(FMLInitializationEvent e) {
	    
		}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    
	}

	
}
