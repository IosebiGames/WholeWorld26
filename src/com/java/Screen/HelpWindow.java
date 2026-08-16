package com.java.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class HelpWindow {
   private ImageIcon image = new ImageIcon(getClass().getResource("pack.png"));
   private ImageIcon background = new ImageIcon(getClass().getResource("background.png"));
   private JLabel photo = new JLabel();
   private JFrame window;
   private JButton BackButton, JoinButton, RankButton, SupportButton;
   private JLabel helpText, SupportText;
   
   public HelpWindow() {
	   window = new JFrame("Get Help In WholeWorld");
	   window.setResizable(false);
	   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   window.setLayout(null);
	   window.setPreferredSize(new Dimension(854, 480));
       window.pack();
	   window.getContentPane().setBackground(Color.white);
	   window.setLocationRelativeTo(null);
	   window.setIconImage(image.getImage());
	   
	   helpText = DefaultComponentFactory.getInstance().createLabel("How can we help you?");
	   helpText.setFont(new Font("Tahoma", 1, 18));
	   helpText.setBounds(300, 37, 239, 39);
	      
	   photo.setIcon(background);
	   photo.setSize(854, 480);
	   
	   JoinButton = new JButton("Can't Join in Server");
	   JoinButton.setBounds(323, 115, 165, 45);
	   JoinButton.setForeground(Color.black);
	   JoinButton.setBackground(Color.white);
	   JoinButton.setFocusable(false);
	   JoinButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      new ServerHelpClass();
	          window.dispose();
		   }
	   });
	   RankButton = new JButton("How to buy a Rank");
	   RankButton.setBounds(323, 171, 165, 45);
	   RankButton.setForeground(Color.black);
	   RankButton.setBackground(Color.white);
	   RankButton.setFocusable(false);
	   RankButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			  new RankClass();
	          window.dispose();  
		  }
	   });
	   SupportButton = new JButton("Online Support");
	   SupportButton.setBounds(323, 303, 165, 45);
	   SupportButton.setForeground(Color.white);
	   SupportButton.setFocusable(false);
	   SupportButton.setEnabled(false);
	   
	   BackButton = new JButton("Back");
	   BackButton.setBounds(15, 378, 89, 45);
	   BackButton.setForeground(Color.black);
	   BackButton.setBackground(Color.white);
	   BackButton.setFocusable(false);
	   BackButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      new Window();
	          window.dispose();
		  }
	   });
	   SupportText = DefaultComponentFactory.getInstance().createTitle("Can't Help You?");
	   SupportText.setFont(new Font("Verdana", 1, 16));
	   SupportText.setBounds(333, 250, 321, 57);
	   
	   window.getContentPane().add(helpText);
	   window.getContentPane().add(JoinButton);
	   window.getContentPane().add(RankButton);
	   window.getContentPane().add(BackButton);
	   window.getContentPane().add(SupportButton);
	   window.getContentPane().add(SupportText);
	   window.getContentPane().add(photo);
	   window.setVisible(true);
   }
}