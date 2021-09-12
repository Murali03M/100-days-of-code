package abstractionoops;

public class Circle extends Shape{
	public void print()
	{
		System.out.println("print the circle");
	}
	public static void main(String args[])
	{
		Shape p1=new Circle();
		p1.print();
	}
	

}
