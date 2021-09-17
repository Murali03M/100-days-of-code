import java.lang.System;
public class Count extends Thread{
	
	 void count()
	 {
	
		 System.out.println("my thread is created"+this);
		 start();
	 }
	 public void run()
	 {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Printing the count"+i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			  System.out.println("my thread interrrupted");
			}
		 }
		 
	 
	System.out.println("thread is over");

}
}
