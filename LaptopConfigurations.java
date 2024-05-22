public class LaptopConfigurations
{

    public LaptopConfigurations() {
    }
   public String brand;
   public String graphicCard;
   public String processor;
   public String ramSize;
   public String romSize;
   public String screenSize;
   public String keyboardLight;
   public double price=15999.99;

   public double getPrice()
   {
       return price;
    }
   
    public String toString()
    {
        return brand+" "+graphicCard+" "+processor+" "+ramSize+" "+romSize+" "+screenSize+" "+keyboardLight;
    }
    
 }