import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("\n*********");
    System.out.println("\n\n****COURIER MANAGEMENT SYSTEM**");
    System.out.println("\n\n**********");
    Courier cou_obj=new Courier();
    System.out.println("1. \t ENTER COURIER DETAILS");
    System.out.println("2. \t DISPLAY COURIER DETAILS"); 
    System.out.println("3. \t CHECK THEIR EXPERIENCE WITH SALARIES");
    System.out.println("4. \t ADMINISTRATOR");
    System.out.println("\n****Enter no. Which list want you to see***");
    int num=in.nextInt();
    int ab=0;
    switch(num)
    {
    case 1:
    ab=k.get();
    break;
    case 2:k.display(ab);
    break;
    case 3:k.admin_menu(ab);
    break;
    case 4:k.sort(ab);
    break;
    
    default:System.out.println("Enter valid number!");
    break;
    }
    System.out.println("**press Y for reentering or N for existing***");
    char re_again=sc.next().charAt(0);
    char set=Character.toUpperCase(re_again);
    if(sel == 'Y') {
    System.out.println("****Enter no. Which list want you to see***");
    num=in.nextInt();
    switch(num)
    {
   case 1:ab=k.get();
    break;
    case 2:k.display(ab);
    break;
    case 3:k.admin_menu(ab);
    break;
    case 4:k.sort(ab);
    break;
    default:System.out.println("Enter valid number!");
    break;
    }
    System.out.println("\n\n**press Y for reentering or N for existing***");
    char ag=in.next().charAt(0);
    char se=Character.toUpperCase(ag);
    if(se == 'Y')
    {
    System.out.println("\n****Enter no. Which list want you to see***");
    num=in.nextInt(); switch(num)
    {
   case 1:ab=k.get();
    break;
    case 2:k.display(ab);
    break;
    case 3:k.admin_menu(ab);
    break;
    case 4:k.sort(ab);
    break;
    default:System.out.println("Enter valid number!");
    break;
    }
    }
    System.out.println("\n\n**press Y for reentering or N for existing***");
    char a=in.next().charAt(0);
    char s=Character.toUpperCase(a);
    if(s == 'Y')
    {
    System.out.println("\n****Enter no. Which list want you to see***");
    num=in.nextInt();
    switch(num)
    {case 1:ab=k.get();
    break;
    case 2:k.display(ab);
    break;
    case 3:k.admin_menu(ab);
    break;
    case 4:k.sort(ab);
    break;
    }
    }
    System.out.println("\n\n**press Y for reentering or N for existing***");
    char aa=in.next().charAt(0);
    char ss=Character.toUpperCase(aa);
    if(ss == 'Y')
    {
    System.out.println("\n****Enter no. Which list want you to see***");
    num=in.nextInt();
    switch(num)
    {
    case 1:ab=e.get();
    break;
    case 2:e.display(ab);
    break; case 3:e.experience(ab);
    break;
    case 4:e.sort(ab);
    break;
    case 5:e.hire(ab);
    break;
    default:System.out.println("Enter valid number!");
    break;
    }
    }
    System.out.println("\n\n**press Y for reentering or N for existing***");
    char aab=in.next().charAt(0);
    char ssb=Character.toUpperCase(aab);
    if(ssb == 'Y')
    {
    System.out.println("\n****Enter no. Which list want you to see***");
    num=in.nextInt();
    switch(num)
    {
    case 1:ab=k.get();
    break;
    case 2:k.display(ab);
    break;
    case 3:k.admin_menu(ab);
    break;
    case 4:k.sort(ab);
    break;
    default:System.out.println("Enter valid number!");
    break;
    }
    }
    else if(ssb == 'N')
    {
    System.out.println("\n****THANKYOU!****");
    }
    else
    {
    System.out.println("\n****ALAS! YOU ENTERED WRONGLY!!!***");
    }
    }
    }
   }
class  Company{
 public int get();
 public void display(int cd);
 public void admin_menu();
 public void sort(int ij);
}
class Courier implements Company{
        String[] a=new String[20];  
        String[] b=new String[20];
        String[] c=new String[20];
        String[] e =new String[20];   
        double  weight[]=new Double[20];
        double insurance[]=new Double[20];
        double charge[]=new Double[20];
        char type[]=new char[20];
        double cost[]=new Double[20];
        String[] ccode=new String[20];
 public static DecimalFormat df2=new DecimalFormat("#,##"); public Courier()
 {
 this.a = a;
 this.b = b;
 this.c = c;
 this.e= e;
 this.weight = weight;
 this.insurance=insurance;
 this.charge = charge;
  this.type = type;
 this.cost = cost;
  this.ccode = ccode;
 }
 public int get()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("\n\n\t@@@@ENTER COURIER DETAILS@@@@");
 System.out.println("\nEnter number of courier details you want to enter  : ");
 int no_d=0;
int choice=0;
 no_emp=sc.nextInt();
 for(int i=0;i<no_d;i++)
 {     
    System.out.println("ENTER THE PARCEL INFORMATION");	
            System.out.println(" "); 
               System.out.println(" ");
              System.out.print("Enter the name of the sender : ");  
               a[i] = in.nextLine();  
              System.out.print("Enter the address of sender  : ");  
              b[i] = in.nextLine();  
              System.out.print("Enter the name of receiver :");  
                c[i] = in.nextLine();                
              System.out.print("Enter the address of receiver  : ");  
               e[i]  = in.nextLine();
              System.out.println("\n\nEnter Client Code");
               ccode [i] = sc.nextLine(); 

           
                System.out.println(" ");
                System.out.println(" ");
		System.out.println ("Shipping Charges Calculation");
		 System.out.println(" ");
		
        
        System.out.println("choose anyof the option for the mode of delivery");
        System.out.println("1. SHIP BY AIR");
        System.out.println("2. SHIP BY TRUCK");
        System.out.println("3. SHIP BY MAIL");

        choice= in.nextInt();
         	
switch (choice) {
			case 1:
				System.out.println ("You have choosen to Ship by Air.");
				System.out.println ("Please enter the package weight");


				 weight[i] = in.nextDouble();
				 cost[i]= weight[i]*100;

				System.out.println("Your Shipment Will Cost:" +cost );							
				
                                break;

			case 2:
				System.out.println ("You have choosen to Ship by Truck.");

				System.out.print("Please enter the package weight: ");

				weight[i] = in.nextDouble();
                                cost[i]=weight[i]*50;
				System.out.println("Your Shipment Will Cost:" +cost);							
				 insurance[i] =cost[i]*10;          
				System.out.println("Insurance will cost" + insurance);
                               

				break;

			case 3:
				System.out.println ("You have choosen to Ship by Mail.");

				System.out.print("Please enter the package weight: ");

			        weight[i] = in.nextDouble();
                                cost[i] = weight[i]*70;
				System.out.println("Your Shipment Will Cost:" + cost);
				insurance[i]=cost[i]*5;
				System.out.println("Insurance will cost" + insurance);
                                
				break;

			

			default:
				System.out.println("Wrong choice.");
			break;
			}
			System.out.println();
	
		System.out.println("Thank you!");
}
 
 }
 return no_d;
}
 public void display(int cd)
 {
 
 for(int i=0;i>cd;i++)
 {
    
        System.out.println("ENTER THE PARCEL INFORMATION");	
            System.out.println(" "); 
               System.out.println(" ");
              System.out.println("\nthe name of the sender : "+a[i]);
              System.out.println(" \nthe address of sender  : "+b[i]);  
              System.out.println("\n the name of receiver :"+c[i]);                
              System.out.println("\nthe address of receiver  : "+e[i]);  
              System.out.println("\nEnter Client Code"+ccode[i]);
              System.out.println("\nEnter Cong Number"+cn[i]);
              //System.out.println("\nthe mode and price of the parcel"+cost[i]+insurance[i]);
      }
 }


public void admin_menu()

{

    
    Scanner in=new Scanner(System.in);

    int ch2;

    System.out.println("\n\n\n\tADMINISTRATOR MENU");
    System.out.println("\n\n\t1.Enter Data ");

   System.out.println("\n\n\t2.DISPLAY ALL Entries ");

    System.out.println("\n\n\t3.DISPLAY SPECIFIC Entry ");
  

    System.out.println("\n\n\t4.BACK TO MAIN MENU");
    System.out.println("\n\n\tPlease Enter Your Choice (4-6) ");

    ch2= in.nextInt();

    switch(ch2)

    {

          case 1: 
          get();
          break;

       case 2: 
       display();
          break;

        case 3: {

            int num;

             System.out.println("\n\n\tPlease Enter The Cong No. ");
             Scanner sc=new Scanner(System.in);
             num = sc.nextInt();

           show_entry(num);

            break;
        }
       

        case 4: 
          return;

        default:
      
         System.out.println("wrong input");
    }

    admin_menu();

}

 }
 
public void sort(int ij)
{
System.out.println("*CUSTOMER NAMES IN AN ASCENDING ORDER**");
 int size=ij;
int i=0;
while(i<size-1)
{for(int j=i+1;j<ij;j++)
{
if(a[i].compareTo(a[j])>0)
{
String temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
i++;
}
for(int g=0;g<ij;g++)
{
System.out.println(a[g]);
}
}
