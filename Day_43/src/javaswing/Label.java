package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
	
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JLabel l1,l2;
		l1=new JLabel("first label");
		l2=new JLabel("second label");
		l1.setBounds(50, 50, 100, 100);
		l2.setBounds(50, 50,200,200);
		f.add(l1);
		f.add(l2);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}

}