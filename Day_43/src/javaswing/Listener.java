package javaswing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Listener extends JFrame implements ActionListener {

	  private Object JButton;

	Listener()
	  {
//		  JFrame f=new JFrame("Event listener");
		  this.setTitle("listener object");
		  JButton b=new JButton("click me");
		  b.setBounds(50, 50, 100, 100);
          b.setFont(new Font("Candara",Font.BOLD,25));
          b.addActionListener(this);
		  this.add(b);
		  this.setSize(600, 600);
		  this.setLayout(null);
		
		  this.setVisible(true);
		  
		  
		  
	  }
	 
	@Override
		public void actionPerformed(ActionEvent e) {
		
			System.out.println("clicked meeee");
			
		}
		
	public static void main(String args[])
	{
		new Listener();
	}

	
}
