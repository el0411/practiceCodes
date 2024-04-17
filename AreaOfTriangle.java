
package mdpract;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main (String[] args)
    {
    double input1, input2, sum; 
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the triangle: ");
    input1 = scanner.nextDouble();
    
     System.out.print("Enter the width of the triangle: ");
    input2 = scanner.nextDouble();
    
    sum = input1*input2;
    
    System.out.println("The area of the triangle is: " + sum);
    
    }
}
