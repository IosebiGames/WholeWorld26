package com.java.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
   private JFrame window = new JFrame("WholeWorld 26");
   private JButton get = new JButton("Help");
   private ImageIcon image = new ImageIcon(getClass().getResource("pack.png"));
   private ImageIcon background = new ImageIcon(getClass().getResource("background.png"));
   private JLabel photo = new JLabel();
   private JLabel titleLabel = new JLabel("WholeWorld 26");
   private JLabel informationLabel = new JLabel("Important: as of 2026, WholeWorld is long gone Minecraft Server.");
   private JLabel informationLabel2 = new JLabel(" Treat this App as something that was built in past.");
   private JButton Refresh = new JButton("Refresh");

   public Window() {
	  window.setResizable(false);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setPreferredSize(new Dimension(854, 480));
      window.pack();
      window.setLayout(null);
      window.setIconImage(image.getImage());
      window.getContentPane().setBackground(Color.black);
      window.setLocationRelativeTo(null);
      
      photo.setIcon(background);
      photo.setSize(854, 480);
    
      titleLabel.setFocusable(false);
      titleLabel.setForeground(Color.black);
      titleLabel.setBounds(300, 25, 270, 40);
      titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
      
      get.setEnabled(true);
      get.setFocusable(true);
      get.setBounds(190, 160, 210, 40);
      get.setFocusPainted(false);
      get.setForeground(Color.black);
      get.setBackground(Color.LIGHT_GRAY);
      get.setFont(new Font("Times New Roman", Font.BOLD, 15));
      get.addActionListener(new ActionListener() {
  		@Override
  		public void actionPerformed(ActionEvent e) {
  			if(e.getSource() == get) {
  				 new HelpWindow();
  				 window.dispose();
  		    }
  		 }
      });
      Refresh.setEnabled(true);
      Refresh.setFocusable(true);
      Refresh.setBounds(190, 210, 210, 40);
      Refresh.setFocusPainted(false);
      Refresh.setForeground(Color.black);
      Refresh.setBackground(Color.LIGHT_GRAY);
      Refresh.setFont(new Font("Times New Roman", Font.BOLD, 15));
      Refresh.setToolTipText("Works for users who's window isn't loaded properly after launching the app.");
      Refresh.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == Refresh) {
				 SwingUtilities.updateComponentTreeUI(window);
		    }
		 }
      });
      informationLabel.setFocusable(false);
      informationLabel.setForeground(Color.white);
      informationLabel.setFont(new Font("Consolas", Font.BOLD, 20));
      informationLabel.setBounds(110, 350, 840, 40);
      
      informationLabel2.setFocusable(false);
      informationLabel2.setForeground(Color.white);
      informationLabel2.setFont(new Font("Consolas", Font.BOLD, 20));
      informationLabel2.setBounds(100, 378, 840, 40);
      
      window.add(titleLabel);
      window.add(get);
      window.add(Refresh);
      window.add(informationLabel);
      window.add(informationLabel2);
      window.add(photo);
      window.setVisible(true);
   }
}