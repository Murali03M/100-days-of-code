import java.util.*;
public class Count_words {
    public static void main(String args[])
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the first word");
           String wor=sc.nextLine();
        
           System.out.println("Ente the counting word");
           String sentence=sc.nextLine();
           int count=0;
            String word=wor.toLowerCase();
           if(!(word.matches("[a-z]+")))
           {
               System.out.println("Invalid input");
               return;
           }
           else
           {
               
               String words[]=sentence.toLowerCase().split(" ");
               for(int i=0;i<words.length;i++)
               {
                   if(word.equals(words[i]))
                   {
                       count++;
                   }
               }


           }
           System.out.println("The score is"+ ((int)Math.pow(2,count-1)));
           System.out.println("The output"+count);

    }
}
