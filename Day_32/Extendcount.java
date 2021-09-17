
public class Extendcount {

	  public static void main(String[] args)
	  {
		  	Count cn=new Count();
		  	try
		  	{
		  		while(cn.isAlive())
		  		{
		  			System.out.println("Thread is still alive");
		  			Thread.sleep(1500);
		  		}
		  	}catch(InterruptedException e)
		  	{
		  		System.out.println("Main thread is interrupted");
		  	}
		  	System.out.println("Main thread is over");
	  }
}
