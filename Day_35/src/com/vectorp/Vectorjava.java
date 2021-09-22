package com.vectorp;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorjava {
	public static void main(String args[])
	{
		Vector v1=new Vector(3,2);
		System.out.println("intial size"+v1.size());
		System.out.println("initial capacity"+v1.capacity());
		v1.addElement(new Integer(4));
		v1.addElement(new Integer(5));
		v1.addElement(new Double(4.5));
		System.out.println("current capacity"+v1.capacity());
		Enumeration vEnum=v1.elements();
		while(vEnum.hasMoreElements())
		{
			System.out.println(vEnum.nextElement()+" ");
		}
		
		
	}

}
