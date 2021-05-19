import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class


public class Main {
      public static void main(String[] args)
      {
          LocalDate obj=LocalDate.now();
          LocalTime clr=LocalTime.now();
          LocalDateTime c=LocalDateTime.now();
          System.out.println(obj);
          System.out.println(clr);
          System.out.println(c);
          DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

          String formattedDate = c.format(myFormatObj);
          System.out.println("After formatting: " + formattedDate);
        }
      }



