
package mdpract;
import java.util.Scanner;

public class Temp {
    public static void main (String[] args)
    {
        int cel, fah; 
        
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temparature in Celsius: ");
        cel = scanner.nextInt();
        
        fah = cel*9/5+32; 
        
        System.out.println(cel + "°C is equal to " + fah + "°F");

        
    }
}
