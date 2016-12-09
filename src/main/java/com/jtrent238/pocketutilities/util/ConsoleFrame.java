package com.jtrent238.pocketutilities.util;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ModContainer;
import net.minecraft.client.Minecraft;

	public class ConsoleFrame {
	    private static Component comp;
		private static ResourceBundle rb;

		/**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
		 * @throws MalformedURLException 
	     */
	    public static void createAndShowGUI() throws MalformedURLException {
	        //Create and set up the window.
	        JFrame frame = new JFrame("FrameConsole");
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        JLabel emptyLabel = new JLabel("THIS IS WORK IN PROGRESS, PLEASE COME BACK SOON!!!");
	        emptyLabel.setPreferredSize(new Dimension(175 * 2, 100 * 2));
	        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
	        //Display the window.
	        
	        
	        //URL url = new URL("https://crafatar.com/avatars/" + Minecraft.getMinecraft().thePlayer.getDisplayName());
	        //URLConnection conn = null;
	        
	        try {
				BufferedImage img = ImageIO.read(new URL("https://crafatar.com/avatars/jtrent238.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
	        //frame.applyResourceBundle(rb);

	        frame.getIconImage();
	        frame.createImage(160, 160);
	        frame.pack();
	        frame.setVisible(true);
	    }

		private ArrayList<ModContainer> mods;
	 
	    public void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                try {
						createAndShowGUI();
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
	            }
	        });
	    }
	
	
}

