
package practice;
import java.util.Scanner;

public class orderMain {
    static Scanner scan = new Scanner(System.in);
      static String ans;
       static order askp = new order("hotdog", 12, 3);
       static order productP = new order("siomai", 5, 1);
       static order info = new order("itlog", 8, 2);
       static order eachP = new order("Piattos", 15); 
        
    public static void main (String[] args)    
    {
        do 
        {
            System.out.print("A. Know the price\n B. Know the products\n C. Know the product details");
            String input = scan.nextLine();
            
            switch(input)
            {
                case "A":                
                    askp.askPrice();
                    productP.askPrice();
                    info.askPrice();
                    eachP.askPrice();
                case "B":
                    System.out.print("input the price: ");
                    double price = scan.nextDouble();
                    
                    if (price == askp.getPrice()) {
                        System.out.println("Product: " + askp.getName());
                    } else if (price == productP.getPrice()) {
                        System.out.println("Product: " + productP.getName());
                    } else if (price == info.getPrice()) {
                        System.out.println("Product: " + info.getName());
                    } else if (price == eachP.getPrice()) {
                        System.out.println("Product: " + eachP.getName());
                    } else {
                        System.out.println("No product found with that price.");
                    }
                case "C":
                    askp.allInfo();
                    productP.allInfo();
                    info.allInfo();
                    eachP.allInfo();
                    break;
            
                
           }    
                
            System.out.println("Do you want to ask again?\n Answer: ");
            ans = scan.nextLine();
       }while(ans != "Y");
   }    
}
