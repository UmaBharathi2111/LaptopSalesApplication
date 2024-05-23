public class LaptopConfigurations
{
   public String brand;
   public String graphicCard;
   public String processor;
   public String ramSize;
   public String romSize;
   public String screenSize;
   public String keyboardLight;
   public double price;

   public double getPrice()
   {
       return price;
    }
   
    public String toString()
    {
        return brand+" "+graphicCard+" "+processor+" "+ramSize+" "+romSize+" "+screenSize+" "+keyboardLight;
    }
    
 }
