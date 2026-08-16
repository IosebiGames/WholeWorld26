package com.java.Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class ServerHelpClass {
   private JFrame window;
   private ImageIcon image = new ImageIcon(getClass().getResource("pack.png"));
   private JButton BackButton;
   private JLabel text;
   private JTextPane TextInsidePane;
   private ImageIcon background = new ImageIcon(getClass().getResource("background.png"));
   private JLabel photo = new JLabel();
  
   public ServerHelpClass() {
	   window = new JFrame("Why Can't I Join the WholeWorld");
	   window.setResizable(false);
	   window.setLayout(null);
	   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   window.setPreferredSize(new Dimension(840, 480));
       window.pack();
	   window.getContentPane().setBackground(Color.white);
	   window.setLocationRelativeTo(null);
	   window.setIconImage(image.getImage());
	   
	   text = DefaultComponentFactory.getInstance().createLabel("So here is how to fix that problem");
	   text.setFont(new Font("Trebuchet MS", 1, 16));
	   text.setBounds(256, 23, 329, 39);
	      
	   photo.setIcon(background);
	   photo.setSize(854, 480);
	   
	   TextInsidePane = new JTextPane();
	   TextInsidePane.setEditable(false);
	   TextInsidePane.setFocusable(false);
	   TextInsidePane.setText("Common causes for failing to join in WholeWorld includes: " + 
	   "\n\n1. Unsupported Minecraft Version: WholeWorld only supports from Minecraft 1.8 to 1.12.2 and Higher." + 
	   "\n2. Using Bedrock: Server doesn't support Minecraft Bedrock Edition or GayserMC plugin, you can't join from the phone." +
	   "\n3. Incorrect Login/Registration: when joining in the server, try to use correct password when you try to log-in, or follow the guide in chat to see how to register." + 
	   "\n4. Ongoing Maintenance/Failure: The server might be under Maintenance because developers are working on it or fixing the server failure, Please wait and try to join later.");
	   TextInsidePane.setFont(new Font("Sitka Text", 1, 17));
	   TextInsidePane.setBounds(10, 80, 790, 284);
	   TextInsidePane.setHighlighter(null);
	   
	   BackButton = new JButton("Back");
	   BackButton.setForeground(Color.black);
	   BackButton.setBackground(Color.white);
	   BackButton.setFocusable(false);
	   BackButton.setBounds(10, 382, 107, 35);
	   BackButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		      new HelpWindow();
	          window.dispose();
		  }
	   });
	   window.getContentPane().add(text);
	   window.getContentPane().add(TextInsidePane);
	   window.getContentPane().add(BackButton);
	   window.getContentPane().add(photo);
	   window.setVisible(true);
   }
}