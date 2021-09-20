package enumeration;
import java.util.*;
public class Enumtester{

	 public static void main(String args[])
	 {
		 Enumeration days;
		 Vector daynames=new Vector();

		 daynames.add("monday");
		 daynames.add("tuesday");
		 daynames.add("wednesday");
		 daynames.add("thurseday");
		 daynames.add("friday");
		 daynames.add("saturday");
		 daynames.add("sunday");
		 daynames.add("monday");
		 
		 days=daynames.elements();
		 while(days.hasMoreElements())
			 
		 {
			 System.out.println(days.nextElement());
		 }
		 
		 
	 }


	}

