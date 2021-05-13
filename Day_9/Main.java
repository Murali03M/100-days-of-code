public class Main {
       public static void main(String[] args)
       {
           Derived d=new Derived();
           d.foo();
       }
}
class Base 
{
    private void foo()
    {
        System.out.println("Base");
    }
}
class Derived extends Base
{
    public void foo()
    {
        System.out.println("Derived");
    }
}