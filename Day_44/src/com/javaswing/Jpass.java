package com.javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Jpass {
	
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JPasswordField p=new JPasswordField();
		JLabel l=new JLabel("Paasword");
		p.setBounds(100, 100, 50,30 );
		l.setBounds(20,100, 100, 30);
		f.add(p);
		f.add(l);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
