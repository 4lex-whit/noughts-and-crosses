package com.github.alex_whit.ui;

import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.github.alex_whit.NoughtsAndCrosses;

public class GUI {
	private static final Logger LOGGER = Logger.getLogger(GUI.class.getName());
	
	private static JFrame frame;
	
	/**
	 * Initialises the GUI frame and components, and adds the components to the frame.
	 */
	private static void init() {
		// frame
		frame = new JFrame(String.format("Noughts and Crosses | %s", NoughtsAndCrosses.VERSION));
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
	}
	
	/**
	 * Sets up the GUI frame and components, and shows the GUI
	 */
	public static void start() {
		
	}
}
