package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JCheck extends JFrame implements ActionListener{
	JLabel l;
	JButton b;
	JCheckBox c1,c2,c3;
	JCheck()
	{
		l=new JLabel("Food order");
		l.setBounds(50, 50, 300, 20);
		c1=new JCheckBox("juice @100");
		c1.setBounds(100, 100, 150, 20);
		c2=new JCheckBox("coffee @80");
		c2.setBounds(100, 150, 150, 20);
		
		c3=new JCheckBox("milk @40");
		c3.setBounds(100, 200, 150, 20);
		
		b=new JButton("order");
		b.setBounds(100, 250, 150, 20);
		b.addActionListener(this); 
		add(l);
		add(c1);
		add(c2);
		add(c3);
		add(b);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float amount=0;
		String msg="";
		if(c1.isSelected())
		{
			amount=100;
			msg="juice 100\n";
		}
		if(c2.isSelected())
		{
			amount+=80;
			msg+="coffee 80\n";
		}
		if(c3.isSelected())
		{
			amount+=40;
			msg+="milk 40\n";
		}
		msg+="------------------\n";
		JOptionPane.showMessageDialog(this,msg+"Total"+amount);
	}
	public static void main(String args[])
	{
		new JCheck();
	}

}
