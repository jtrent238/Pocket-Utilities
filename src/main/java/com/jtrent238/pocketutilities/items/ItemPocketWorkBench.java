package com.jtrent238.pocketutilities.items;

import com.jtrent238.pocketutilities.Achievements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPocketWorkBench extends Item {

	public ItemPocketWorkBench(){
		this.setMaxStackSize(1);
		
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if(!world.isRemote)
        {
        	player.displayGUIWorkbench(x, y, z);
        }
        return true;
    }
	
	/**
     * Called when item is crafted/smelted. Used only by maps so far.
     */
    public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_) {
    	
    	p_77622_3_.triggerAchievement(Achievements.achievementCraftWorkbench);
    }

}
