package practice;

import java.util.Scanner;

public class Practice {

    Scanner scanner = new Scanner(System.in);
    
int userInput; 
int sum1, sum2, sum3;

void showNumberPlus10()
{
    sum1 = userInput + 10;
    System.out.println(userInput + " plus 10 is " + sum1 );
}
        
 void showNumberPlus100()
{
    sum2 = userInput + 100;
    System.out.println(userInput + " plus 100 is " + sum2 );
}
 
 void showNumberPlus1000()
{
    sum3 = userInput + 1000;
    System.out.println(userInput + " plus 1000 is " + sum3 );
}
    
}
