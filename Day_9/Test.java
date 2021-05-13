public class Test {
     public static void main(String[] args)
     {
         Child c=new Child();
         c.Child();
         System.out.println("parent constructor value "+c.val);
         Parent p=new Parent();
         p.Parent();
         System.out.println("Children constructor value"+p.val);

     }
    
}
class Parent 
{
    int val=10;
    void Parent()
    {
        System.out.println("parent constructor ");
    }
}
class Child extends Parent 
{
    int val=1000;
    void Child()
    {
        System.out.println("Child constructor "); 
    }
}
