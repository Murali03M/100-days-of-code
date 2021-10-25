package com.swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Combo {

	  JFrame f;
	  Combo()
	  {
		  
		  f=new JFrame("combo box");
		  String[] lang= {"c program","java","python"};
          JComboBox b=new JComboBox(lang);
          b.setBounds(50, 50, 100, 30);
          f.add(b);
          f.setLayout(null);
          f.setSize(400,400);
          f.setVisible(true);
	  }
	  public static void main(String args[])
	  {
		  new Combo();
		  
	  }
}
