package com.accenture.stack;

import java.util.Stack;

public class StackJava {
	static void  showpush(Stack st,int a)
	{
		st.push(new Integer(a));
		System.out.println("push"+a);
		System.out.println("Stack"+st);
	}
 static void showpop(Stack st)
 {
	 Integer a=(Integer) st.pop();
	 System.out.println(st);
 }
	
	public static void main(String[] args)
	{
		Stack st=new Stack();
		System.out.println("Stack"+st);
		showpush(st, 12);
		showpush(st,16);
		showpop(st);
		showpush(st,13);
	}

}
