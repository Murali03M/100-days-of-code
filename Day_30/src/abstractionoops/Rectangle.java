package abstractionoops;

public class Rectangle extends Shape{
	
	public void print()
	{
		System.out.println("Print the rectangle");
	}
	public static void main(String args[])
	{
		Shape p=new Rectangle();
		p.print();
		
	}
	     

}
