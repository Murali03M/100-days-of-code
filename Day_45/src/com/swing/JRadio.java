package com.swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadio {
	
	JFrame f;
	JRadio()
	{
		f=new JFrame("frame button");
		JRadioButton rb1=new JRadioButton("a) male");
		JRadioButton rb2=new JRadioButton("b) female");
		 rb1.setBounds(20, 50, 100, 20);
		 rb2.setBounds(20, 100, 100, 20);
		 ButtonGroup bg=new ButtonGroup();
		 bg.add(rb1);
		 bg.add(rb2);
		 f.add(rb2);
		 f.add(rb1);
		 f.setLayout(null);
		 f.setSize(400, 400);
		 f.setVisible(true);
		 
		 
	}
	public static void main(String args[])
	{
		new JRadio();
	}

}
