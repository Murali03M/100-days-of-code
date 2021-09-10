package com.exception;
import java.io.FileReader;
import java.util.Properties;
import java.io.*;
public class Exception1 {

	   public static void file()
	   {
		   FileReader read=null;
		   try
		   {
			   read=new FileReader("file.properties");
			   Properties props=new Properties();
			   props.load(read);
			   System.out.println(props.getProperty("name"));
			   System.out.println(props.getProperty("age"));
			   
			   
		   }catch(IOException e)
		   {
			   System.out.println(e.getLocalizedMessage());
		   }
	   }
	   public static void write1()
	   {
		   FileWriter lkmm=null;
		   try
		   {
			   lkmm=new FileWriter("index.txt",true);
			   String data="Welcome to my another world";
			   lkmm.write(data);
			   lkmm.close();
			   
		   }catch(IOException e)
		   {
			   System.out.println(e.getLocalizedMessage());
		   }
		   
		   
		   
	   }
	   
	   public static void read1()
	   {
		   FileReader mmm=null;
		   try
		   {
			   mmm=new FileReader("index.txt");
			   int data;
			   while((data=mmm.read())!=-1)
			   {
				   System.out.print((char)data);
			   }
			   
		   }catch(IOException e)
		   {
			   System.out.println(e.getLocalizedMessage());
		   }
	   }
}
