package javaswing;

import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Buttonexample extends JFrame {
	
   
	Buttonexample() {
		JFrame frame=new JFrame("Button example");
		JButton b=new JButton(new ImageIcon("C:/Users/murali/Desktop/100-days-of-code/Day_43/src/ipl.jpg"));
		b.setBounds(200, 200, 300,300);
		frame.add(b);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
   public static void main(String[] args)
   {
	  new Buttonexample();
   }
}
