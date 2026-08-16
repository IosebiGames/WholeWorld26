package com.java.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class RankClass {
   private JFrame window;
   private ImageIcon image = new ImageIcon(getClass().getResource("pack.png"));
   private JButton BackButton;
   private JLabel questionLabel;
   private JTextPane Rankpane;
   private ImageIcon background = new ImageIcon(getClass().getResource("background.png"));
   private JLabel photo = new JLabel();
   
   public RankClass() {
	   window = new JFrame("How to Buy Ranks In WholeWorld");
	   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   window.setLayout(null);
	   window.setResizable(false);
	   window.setPreferredSize(new Dimension(854, 480));
	   window.pack();
	   window.getContentPane().setBackground(Color.white);
	   window.setLocationRelativeTo(null);
	   window.setIconImage(image.getImage());
	   
	   questionLabel = DefaultComponentFactory.getInstance().createLabel("How I Can Buy Ranks In WholeWorld?");
	   questionLabel.setFont(new Font("Trebuchet MS", 1, 23));
	   questionLabel.setBounds(193, 33, 444, 36);
	      
	   photo.setIcon(background);
	   photo.setSize(854, 480);
	   
	   Rankpane = new JTextPane();
	   Rankpane.setFocusable(false);
	   Rankpane.setFont(new Font("Sitka Subheading", 1, 18));
	   Rankpane.setText("Buying ranks in this server is easy. Highest possible Rank in the server is \"MVP\" But you can also find Creates in the server. To Open them, You Need keys! but All Keys Are Paid, There are No Free keys. You Can Buy Ranks Or Creates In our Discord Server.");
	   Rankpane.setEditable(false);
	   Rankpane.setHighlighter(null);
	   Rankpane.setBounds(10, 81, 795, 283);
	   
	   BackButton = new JButton("Back");
	   BackButton.setBounds(20, 378, 89, 36);
	   BackButton.setForeground(Color.black);
	   BackButton.setBackground(Color.white);
	   BackButton.setFocusable(false);
	   BackButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      new HelpWindow();
	          window.dispose();
		  }
	   });
	   window.getContentPane().add(questionLabel);
	   window.getContentPane().add(Rankpane);
	   window.getContentPane().add(BackButton);
	   window.getContentPane().add(photo);
	   window.setVisible(true);
   }
}