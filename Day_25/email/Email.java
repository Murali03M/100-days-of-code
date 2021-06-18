package email;
import java.util.*;
public class Email {   
    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private int defaultPasswordLength=10;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String email_id;
    private String company="futureofiot";

    public Email(String firstname, String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Email created:"+this.firstname+" "+this.lastname);
        
        this.department=SetDepartment();
        
        //combine element to generate mailid 
        email_id=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+ company+".com";
        
        //call a method on randompassword
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password:"+this.password);
        
       
    }
    //Ask for the department
    private String SetDepartment()
    {
    	System.out.println("DEPARTMENT CODES:\n1 for sales\n2 for development\n3 for accounting\n 0 for none\nEnter the department code:");
    	Scanner in=new Scanner(System.in);
    	int depchoice =in.nextInt();
    	if(depchoice==1)
    	{
    		return "sales";
    	}
    	else if(depchoice==2)
    	{
    		return "Development";
    	}
    	else if(depchoice==3)
    	{
    		return "Acccounting";
    		
    	}
    	else
    	{
    		return " ";
    	}
    	
    }
    //Generate Random password
    private String randomPassword(int length)
    {
    	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
    	char[]  password=new char[length];
    	for(int i=0;i<length;i++)
    	{
    		int rand=(int)(Math.random()*passwordSet.length());
    		password[i]=passwordSet.charAt(rand);
    	}
    	return new String(password);
    	
    }
      
    //Set the mailBox capacity
      public void setMailboxCapacity(int capacity)
      {
    	  this.mailboxCapacity=capacity;
      }
      //change password
      public void changePassword(String password)
      {
    	  this.password=password;
      }
      public int getMailboxCapacity() {
    	      return mailboxCapacity; 
      }
      public String getAlternateMail()
      {
    	  return alternateEmail; 
      }
      public void showInfo()
      {public class Email {
          
      }
      
    System.out.println("Display name:"+firstname+" "+lastname+"\ncompany email:"+email_id+"\nMail box capacity:"+mailboxCapacity+"mb");
      }
}
