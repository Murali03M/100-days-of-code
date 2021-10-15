package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Label {
	
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JLabel l1,l2;
		JTextField t1,t2;
		t1=new JTextField("welcome to my first java code");
		t2=new JTextField("welcome to my second text filed ");
		t1.setBounds(50, 100, 200, 30);
		t2.setBounds(50, 150,200,30);
		l1=new JLabel("first label");
		l2=new JLabel("second label");
		l1.setBounds(100, 150, 100, 100);
		l2.setBounds(100, 150,200,200);
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}

}