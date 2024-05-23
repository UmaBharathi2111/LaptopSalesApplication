import java.util.Scanner;

public class SalesDecision
{
public static void main(String args[])
{
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the Brand :");
      String brand = s.next();
      System.out.print("Enter the Graphic Card :");  
      String graphicCard = s.next();
      System.out.print("Enter the processor :");
      String processor = s.next();
      System.out.print("Enter the ramSize :");
      String ramSize = s.next();
      System.out.print("Enter the Romsize :");
      String romSize = s.next();
      System.out.print("Enter the KeyboardLight you want:");
      String keyboardLight = s.next();
      System.out.print("Enter the Screensize you want :");
      String screenSize = s.next();
      
      boolean result = new CheckStock().available(brand,graphicCard,processor,ramSize,romSize,keyboardLight,screenSize);

      if(result == true)
      {
          System.out.println("Yes we have the Laptop. The price is :"+ CheckStock.Price);
          System.out.println("Wanna Buy the Laptop ??....(Y/N)");
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
           System.out.println("Sorry we are not having such laptop....");
      }
    s.close();
    }
}