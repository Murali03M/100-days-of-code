
public class MultiThreading extends Thread {

	@Override 
	public void run()
	{
		System.out.println("1. this one is first");
		
	}
   
	public static void main(String[] args) {
		
		MultiThreading mt=new MultiThreading();
		mt.start();
		

	}

}
