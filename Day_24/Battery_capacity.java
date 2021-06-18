import java.util.*;
public class Battery_capacity {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the battery capacity");
        int bat_capacity=sc.nextInt();
        System.out.println("Enter the charging current");
        int char_current=sc.nextInt();
        double time=0.0f;
        time=(bat_capacity/char_current)*1.2;
        System.out.printf(String.format("%.2f",time)+"Hours");

    }

    
}
