import java.util.*;

public class Bike_Rent {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextInt();
            double sal=0;double disc=0; 
            for(int i=0;i<str.length();i++)
            {
                if(!Character.isLetter(str.charAt(i)))
                {
                    int n=sc.nextInt();
                    System.out.println("Invalid input");
                    return;
                }
            }
            System.out.println("Enter the time");
            int n1;
            if(n<=0 || n>24)
            {
                System.out.println("Invalid input");
                return ;
            }
            System.out.println("List of payment option");
            System.out.println("1)Visa card");
            System.out.println("2)Rupay card");
            System.out.println("3)Master card");
            System.out.println("Chosse an option"); 
            while(true)
            {
                n1=sc.nextInt();
                if(n1<0||n1>3)
                {
                System.out.println("Try again");
                }
                else
                {
                break;
                }
                }
                if( n1==1)
                {
                if(n>=5)
                {
                sal=120*n;
                disc=(sal*0.25);
                sal=sal-disc;
                }
                else
                {
                sal=n*120;
                }
                }
                if(n1==2)
                {
                if(n>=5)
                {
                sal=120*n;
                disc=(sal*0.17);
                sal=(120*n)-disc;
                }
                else
                {
                sal=n*120;
                }
                }
                if(n1==3)
                {
                sal=n*120;
                }
                System.out.print("Dear "+s+" your bill amount is ");
                System.out.printf("%.2f", sal);
                

        }
    
}
