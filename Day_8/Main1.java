public class Main1 {
     public static void main(String[] args)
     {
         two g=new two();
         g.name();
         g.name1();
         g.name();
         
        
     }
}
class one {
    void name()
    {
     System.out.println(" hiii..!");
    }
}
class two extends one
{ 
    void name1()
    {
  System.out.println("Hello...");

}}
