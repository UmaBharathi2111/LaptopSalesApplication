import java.util.ArrayList;

public class LaptopStock
{
   public ArrayList<LaptopConfigurations> availableLaptops()
   {
     
             LaptopConfigurations  dellInspiron = new LaptopConfigurations();
             dellInspiron.brand="Dell";
             dellInspiron.graphicCard="2GB";
             dellInspiron.processor="intel-i5";
             dellInspiron.ramSize="8GB";
             dellInspiron.romSize="256GB";
             dellInspiron.keyboardLight="White";
             dellInspiron.screenSize = "13.3 inches";
             dellInspiron.price=638900;

             LaptopConfigurations acerNitro = new LaptopConfigurations();
             acerNitro.brand ="Acer";
             acerNitro.graphicCard="4GB";
             acerNitro.processor="AMDRyzen";
             acerNitro.ramSize="16GB";
             acerNitro.romSize = "256GB";
             acerNitro.keyboardLight="RGB";
             acerNitro.screenSize = "14 inches";
             acerNitro.price = 58000;

             LaptopConfigurations hpPavillion = new LaptopConfigurations();
             hpPavillion.brand = "HP";
             hpPavillion.graphicCard = "2GB";
             hpPavillion.processor = "intel-i7";
             hpPavillion.ramSize ="16GB";
             hpPavillion.romSize = "1TB";
             hpPavillion.keyboardLight ="Blue";
             hpPavillion.screenSize = "16 inches";
             hpPavillion.price = 60500;

            
             ArrayList<LaptopConfigurations> stock =new ArrayList<>();
             stock.add(dellInspiron);
             stock.add(acerNitro);
             stock.add(hpPavillion);
             
         return stock;
   }
   
}