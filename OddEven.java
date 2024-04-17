
package mdpract;
import java.util.Scanner;

public class OddEven {
    
    public static void main (String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
      int one;
      
      System.out.print("Enter a number: ");
      one = scanner.nextInt();
      
      if (one % 2 == 0)
      {
          System.out.println( one + " is an even number");
      }
      else 
      {
          System.out.println( one + " is an odd number");
      }
    }
    
}
