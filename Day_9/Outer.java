class Outer {
    private String msg = "GeeksforGeeks";
    private void fun() {
         System.out.println("Outer fun()");
    }
 
    class Inner extends Outer {
        private void fun()  {
              System.out.println("Accessing Private Member of Outer: " + msg);
        }
    }
 
    public static void main(String args[])  {
 
         Outer o = new Outer();
         Inner  i   = o.new Inner();
           
        
         i.fun();  
 
         
         o = i; 
         o.fun();
    }
}