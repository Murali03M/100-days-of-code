 import java.util.Scanner;
 public class TestEncapsulate {
    
     public  static void main(String[] args)
     {
          Encapsulate obj=new Encapsulate();
          obj.setstr("Malai");
          obj.setage(18);
          obj.setrollnum(4094);

          System.out.println("name"+obj.getstr());
          System.out.println("Age"+obj.getage());
          System.out.println("Roll num"+obj.getrollnum());



     }
}

class Encapsulate
{
   private String str;
   private int age;
   private int rollnum;
                
   public String getstr()
   {
       return str;
   }
   public int getage()
   {
       return age;
   }

   public String getrollnum()
   {
       return str;
   }
   public void setstr(String str)
   {
       this.str=str;
   }
   public void setage(int age)
   {
       this.age=age;
   }
   public void setrollnum(int rollnum)
   {
       this.rollnum=rollnum;
   }
}