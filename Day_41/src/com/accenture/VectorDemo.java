package com.accenture;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[])
	{
		Vector v=new Vector(3,2);
		System.out.println("Initial size"+v.size());
		System.out.println("Initial capacity"+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("capacity after four addition"+v.capacity());
	}

}
