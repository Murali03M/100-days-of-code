package com.workwithmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Author {
   public static void main(String args[])
   {
	   Map<String,Book> bookMap=new HashMap<String,Book>();
	   
	   bookMap.put("value1", new Book("trueoddd","murli"));
	   bookMap.put("value2", new Book("tttrueoddd","mmmurli"));
	   Set<Entry<String,Book>> entrySet=bookMap.entrySet();
	   for(Entry<String,Book>e:entrySet)
	   {
		   System.out.println(e);
	   }
	   
	   
   }
}
