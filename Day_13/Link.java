
 import java.util.LinkedList;

public class Link
{
  public static void main(String[] args) {
   LinkedList<String> cars=new LinkedList<String>(); 
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
   
    cars.addFirst("Mazda");
    System.out.println(cars);
    cars.removeFirst();
    System.out.println(cars);
    cars.addLast("Benz");
    System.out.println(cars);
    System.out.println(cars);
    System.out.println(cars.getFirst());
    System.out.println(cars.getLast());
  }
}
