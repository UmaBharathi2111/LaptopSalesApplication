
import java.util.Scanner;

public class Main
{
public static void main(String args[])
{
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Brand :");
      String brand = s.next();
      System.out.println("Enter the Graphic Card :");  
      String graphicCard = s.next();
      System.out.println("Enter the processor :");
      String processor = s.next();
      System.out.println("Enter the ramSize :");
      String ramSize = s.next();
      System.out.println("Enter the Romsize :");
      String romSize = s.next();
      System.out.println("Enter the Screensize you want :");
      String screenSize = s.next();

      boolean result = new CheckStock().available(brand,graphicCard,processor,ramSize,romSize,screenSize);

      if(result == true)
      {
          System.out.println("Yes we have the Lapi The price is :"+ CheckStock.Price);
          System.out.println("Wanna Buy the Lapi ??....(Y/N)");
          String user = s.next();
          if(user.equalsIgnoreCase("Y"))
          {
              System.out.println("Thank you for buying....");
          }
          else
          {
              System.out.println("Thank you....for your response");
          }
      }
      else
      {
           System.out.println("Sorry we are ot having such laptop....");
      }
    }
}