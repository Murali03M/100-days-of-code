import java.util.*;
public class ListDemo
{
    public static void main(String args[])
    {
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        l1.add(2,3);
        System.out.println(l1);
        List<Integer>  l2=new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2); 
        l1.set(0,4);
        System.out.println(l1);
        l1.remove(0);
        System.out.println(l1);




    }
}  