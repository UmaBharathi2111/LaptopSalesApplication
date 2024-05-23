import java.util.*;
public class CheckStock
{
      publicic double Price;
      public boolean available( String brand,String graphicCard,String processor,String ramSize, String romSize,String screenSize)
      {
        List<LaptopConfigurations> L = new LaptopStock().availableLaptops();
        for(LaptopConfigurations l : L)
        {
            if(brand.equalsIgnoreCase(l.brand) && graphicCard.equalsIgnoreCase  (l.graphicCard) && processor.equalsIgnoreCase(l.processor) && ramSize.equalsIgnoreCase(l.ramSize) && screenSize.equalsIgnoreCase(l.screenSize))
            {
                Price = l.getPrice();
                result = true;
            }
        }
        return false;
      }
   }
