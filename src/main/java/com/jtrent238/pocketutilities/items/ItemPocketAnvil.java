package com.jtrent238.pocketutilities.items;

import com.jtrent238.pocketutilities.Achievements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPocketAnvil extends Item {

	public ItemPocketAnvil(){
		this.setMaxStackSize(1);
		
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		if(par3EntityPlayer instanceof EntityPlayerMP){
		((EntityPlayerMP)par3EntityPlayer).displayGUIAnvil((int)par3EntityPlayer.posX,(int)par3EntityPlayer.posY,(int)par3EntityPlayer.posZ);
		          //hope that works                     
		}
		return par1ItemStack;
		}
		
	
	/**
     * Called when item is crafted/smelted. Used only by maps so far.
     */
    public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_) {
    	
    	p_77622_3_.triggerAchievement(Achievements.achievementCraftAnvil);
    }
}
