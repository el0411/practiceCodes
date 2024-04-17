package mdpract;
import java.util.Scanner;

public class CalculateArea {
     
    double sum, radius, length, width;
     
    
    public CalculateArea(double radius)
    {
        this.radius = radius;
        
        sum = radius*radius;
    }
    
     public CalculateArea(double length, double width)
    {
        this.length = length;
        this.width = width;
        
        sum = length*width; 
    }
        
     
     public static void main (String[] args)
     {
         
          Scanner scanner = new Scanner(System.in);
         
      System.out.println(" Calculate Area \n1. Circle \n2.Rectangle");
      System.out.print("Enter your choice: ");
      int ans = scanner.nextInt();
      
      if ( ans == 1)
      {
          System.out.print("Enter the radius of the Circle: ");
          double radius = scanner.nextDouble();
          CalculateArea circle = new CalculateArea(radius);
           System.out.println("Area of the circle: " + circle.sum);
      }
      else if ( ans == 2)
      {
          System.out.print("Enter the Length of the Triangle: ");
          double length = scanner.nextDouble();
          System.out.print("Enter the Width of the Triangle: ");
          double width = scanner.nextDouble();
          CalculateArea rectangle = new CalculateArea(length, width);
           System.out.println("Area of the Rectangle: " + rectangle.sum);
      } else 
      {
     scanner.close();
         
     }
}
}1