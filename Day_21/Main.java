import java.util.*;
public class Main {
    
      public static void main(String args[])
      {
          HashSet hs=new HashSet();
          hs.add(100);
          hs.add("Welcome");
          hs.add(16.4);
          hs.add(true);
          hs.add(null);
          System.out.println(hs);
          hs.remove(16.4);
          System.out.println(hs);
          System.out.println(hs.contains("true"));
          System.out.println(hs.isEmpty());
          for(Object e:hs)
          {
            System.out.println(e);
          }
          Iterator it=hs.iterator();
          while(it.hasNext())
          {
            System.out.println(it.next());
          }



      }
}
