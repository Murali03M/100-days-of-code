package com.accenture.stack;

public class Testert {
	int x=10;
	static {
		x=10;
		System.out.println(x);
	}
public static void main(String[] args) {
  
	Testert d=new Testert();
	System.out.println(d.x);
}
}

