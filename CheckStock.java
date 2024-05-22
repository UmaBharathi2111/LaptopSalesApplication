/*import java.util.*;
public class CheckStock

{
      static double Price;
      public boolean available( String brand,String graphicCard,String processor,String ramSize, String romSize,String screenSize)
      {
        
        boolean result = false;
        List<LaptopConfigurations> L = new LaptopStock().availableLaptops();
        for(LaptopConfigurations l : L)
        {
            if(brand.equalsIgnoreCase(l.brand) && graphicCard.equalsIgnoreCase  (l.graphicCard) && processor.equalsIgnoreCase(l.processor) && ramSize.equalsIgnoreCase(l.ramSize) && screenSize.equalsIgnoreCase(l.screenSize))
            {
                result = true;
                Price = l.getPrice();
            }
        }
        return result;
      }
    }*/

import java.util.*;
public class CheckStock
{
      static double Price;
      public boolean available( String brand,String graphicCard,String processor,String ramSize, String romSize,String screenSize)
      {
        
        boolean result = false;
        List<LaptopConfigurations> L = new LaptopStock().availableLaptops();
        for(LaptopConfigurations l : L)
        {
            if(brand.equalsIgnoreCase(l.brand) && graphicCard.equalsIgnoreCase  (l.graphicCard) && processor.equalsIgnoreCase(l.processor) && ramSize.equalsIgnoreCase(l.ramSize) && screenSize.equalsIgnoreCase(l.screenSize))
            {
                result = true;
                Price = l.getPrice();
            }
        }
        return result;
      }
   }
