package com.swing.jframe;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Firstframe {
   public static void main(String args[])
   {
	   JFrame frame=new JFrame();
	   JButton b=new JButton("Click me");
	   b.setBounds(100, 60, 50, 60);
	   frame.add(b);
	   frame.setSize(600,500);
	   frame.setTitle("my first frame");
	   frame.setVisible(true);
	   
   }
}
