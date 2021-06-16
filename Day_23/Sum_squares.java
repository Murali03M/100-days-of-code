import java.util.*;

import javax.print.event.PrintJobListener;
public class Sum_squares {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int count=0;
            if(n<=0)
            {
                System.out.println("Invalid input");
            }
            else 
            {
                int[] a=new int(n);
            for(int i=0;i<n;i++)
            {
                 a[i]=sc.nextInt();
                 if(a[i]%2!=0)
                 {
                     count+=1;
                 }

            }
            if(count<=0)
            {
                System.out.println("Invalid Answer");
            }
            else
            {
                 for(int i=0;i<n;i++)
                 {
                     int sum=0;
                     if(a[i]%2!=0)
                     {
                         sum=sum+ a[i]*a[i]; 
                     }
                     System.out.println(sum);
                 }
            }
        }
        }
}    

