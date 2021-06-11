import java.util.*;
public class HashDemo {
        public static void main(String args[])
        {
            HashSet<Integer> evennumber=new HashSet<Integer>();
            evennumber.add(2);
            evennumber.add(4);

            HashSet<Integer> number =new HashSet<Integer>();
            number.addAll(evennumber);
            number.add(10);
            System.out.println(number);

            //removeAll()

        }
}
