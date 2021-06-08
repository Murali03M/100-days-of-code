import java.util.Scanner;

public class Main {
  public static void main(String args[])
  {
       Scanner main=new Scanner(System.in);
       System.out.println("1.User input");
       System.out.println("2.User output");
       System.out.println("3.");


  }

class Courier_details {   

        System.out.println ("***COURIER MANAGEMENT SYSTEM***");
        // System.out.println(" ");
        // System.out.println(" ");
        Scanner sc= new Scanner(System.in);
        double weight=0.00;
        double cost=0.00;
        double insurance=0.00;
        int choice=0;  
    System.out.println("!!!!!!!!! ENTER THE PARCEL INFORMATION !!!!!!!!!");	 
              System.out.print("Enter the name of the sender : ");  
              String name_sender=sc.nextLine(); 
              System.out.print("Enter the address of sender  : ");  
             String address_sender= sc.nextLine(); 
              System.out.print("Enter the Ph num of sender  : ");  
              String num_sender=sc.nextLine();   
              System.out.print("Enter the name of receiver :");  
               String name_reciever=sc.nextLine();                
              System.out.print("Enter the address of receiver  : ");  
               String address_reciever=sc.nextLine();
               System.out.print("Enter the ph num of Reciever  : ");  
              String num_reciever=sc.nextLine();  
               //System.out.println(" ");
       // System.out.println("************");
       do
       {
		System.out.println ("Shipping Charges Calculation");
        System.out.println("choose anyof the option for the mode of delivery");
        System.out.println("1. SHIP BY AIR");
        System.out.println("2. SHIP BY TRUCK");
        System.out.println("3. SHIP BY MAIL");
        System.out.println("4. TO SEE SENDER INFROMATION");
		System.out.println("5. TO SEE RECIEVER INFORMATION");
		System.out.println("6.TO RETURN A PARCEL"); 
		System.out.println("7.TO EXIT"); 
	     choice=sc.nextInt();
        switch (choice) {
			case 1:
				System.out.println ("You have choosen to Ship by Air.");
				System.out.println ("Please enter the package weight");
                 weight =sc.nextDouble();
			     cost= weight*100.0;
                System.out.println("Your Shipment Will Cost:" +cost );							
				break;

			case 2:
				System.out.println ("You have choosen to Ship by Truck.");

				System.out.print("Please enter the package weight: ");

				 weight =sc.nextDouble();
                 cost=weight*50.0;
				System.out.println("Your Shipment Will Cost:" +cost);							
			     insurance =cost*10.0;          
				System.out.println("Insurance will cost" + insurance);
                break;

			case 3:
				System.out.println ("You have choosen to Ship by Mail.");

				System.out.print("Please enter the package weight: ");

			     weight =sc.nextDouble();
                 cost = weight*70.0;
				System.out.println("Your Shipment Will Cost:" + cost);
				insurance=cost*5.0;
				System.out.println("Insurance will cost" + insurance);
                break;
			case 4:
				System.out.println("\nSender Name " +name_sender+"\nSender Address " +address_sender+ "\nSender's Phone Number "+num_sender);
                break;
			case 5:
				System.out.println("\nReciever Name "+name_reciever+"\nReciever Address " +address_reciever+"\nReciever's Phone Number "+num_reciever);
                break;
			case 6:
			    System.out.println("Enter a valid reason for Returning");
				// Scanner sr = new Scanner(System.in);
				// String rtn = sr.nextLine();
				// {
				// 	System.out.println("Your pakage will be Returned with 2 days");
				// }
			
			default:
				    System.out.println("Thank you for using our courier system!");
			
			}

}while(choice!=7);
 
}

