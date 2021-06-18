import java.util.Scanner;

public class Lcm {
        
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int a=num1;
        int b=num2;
        while(num2>0)
        {
            if(num1>num2)
            {
                num1=num1-num2;
            }
            else
            {
                num2=num2-num1;
            }

        }
        int gcd=num1;
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}
