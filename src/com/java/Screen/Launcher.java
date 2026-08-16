package com.java.Screen;

import javax.swing.SwingUtilities;
import com.formdev.flatlaf.FlatDarkLaf;

public class Launcher {
   public static void main(String[] args) {
	   FlatDarkLaf.setup();
	   SwingUtilities.invokeLater(Window :: new);
   }
}