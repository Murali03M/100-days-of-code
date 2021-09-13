package com.arraylist;
import java.util.*;

public class Productex {
	
	public static void main(String args[])
	{
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(11,"sharu",12000));
		plist.add(new Product(12,"sharu",13000));
		plist.add(new Product(13,"sharu",14000));
		plist.add(new Product(14,"sharu",15000));
		System.out.println(plist); 
		Collections.sort(plist, new Idcomp());
		System.out.println("--------frgfsyufgvsrjhgfkdr=-------");
		System.out.println(plist); 
		
	}

}
