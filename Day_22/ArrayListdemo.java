import java.util.*;
public class ArrayListdemo {
      
          public static void main(String args[])
          {
              ArrayList al=new ArrayList();
            //   List al=new ArrayList();
            al.add(100);
            al.add("welcome");
            al.add(15.5);
            al.add('A');
            al.add(true);
           System.out.println(al);
           System.out.println(al.size());
             al.remove(1);
             System.out.println(al);
             for(Object e:al)
             {
                System.out.println(e);
             }


          }
        
}
