import java.util.regex.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(moveSpecialCharacters(str));

    }
   static String moveSpecialCharacters(String str)
   {
       int len=str.length();
       String regex = "[^a-zA-Z0-9\\s+]";
       String s1="";
       String s2="";
       for(int i=0;i<len;i++)
   {
       char c=str.charAt(i);
       if(String.valueOf(c).matches(regex))
       {
           s1=s1+c;
       }
       else
       {
           s2=s2+c;
       }
   }
   return s2+s1;
   }

}