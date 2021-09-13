package com.arraylist;
import java.util.*;
public class Idcomp implements Comparator<Product> {
	 
	 @Override
	 public int compare(Product o1,Product o2)
	 {
		 int temp=0;
		 if(o1.getId()>=o2.getId())
		 {
			 temp=-1;
			 
		 }
		 else
		 {
			 temp=1;
		 }
		 return temp;
		 
	 }

}
