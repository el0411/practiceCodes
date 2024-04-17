
package mdpract;

import java.util.Scanner;

public class Shapes {
    
     double radius, length, width, height;
     int base; 
     
    public Shapes(double radius)
    {
        this.radius = radius;
        double sum = radius*radius;
    }
    
    public Shapes(double length, double width)
    {
        this.length = length;
        this.width = width;
        
        double  sum = length*width; 
    }
    
    public Shapes (int base, double height)
    {
       this.base = base;
       this.height = height;
       
       double sum = base*height;
    }
    
    public static void main (String[] args)
     {
         
          Scanner scanner = new Scanner(System.in);
         
      System.out.println(" Calculate Area \n1. Circle \n2. Rectangle \n3. Triangle");
      System.out.print("Enter your choice: ");
      int ans = scanner.nextInt();
      
     switch(ans)
     {
         case 1 :
      {
          System.out.print("Enter the radius of the Circle: ");
          double radius = scanner.nextDouble();
          CalculateArea circle = new CalculateArea(radius);
           System.out.println("Area of the circle: " + circle.sum);
      }
         case 2:
      {
          System.out.print("Enter the Length of the Triangle: ");
          double length = scanner.nextDouble();
          System.out.print("Enter the Width of the Triangle: ");
          double width = scanner.nextDouble();
          CalculateArea rectangle = new CalculateArea(length, width);
           System.out.println("Area of the Rectangle: " + rectangle.sum);
      } 
         case 3:
      {
          System.out.print("Enter the length of the Triangle: ");
          double length = scanner.nextDouble();
          System.out.print("Enter the base of the Triangle: ");
          double base = scanner.nextInt();
          
          
          
          
      }
    
}
     }
}3
333
