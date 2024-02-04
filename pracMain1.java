
package practice;

public class pracMain1 {
    
    public static void main(String[] args) {
        Practice practice = new Practice(); 
        
        System.out.print("Enter an Ineteger: ");
        practice.userInput = practice.scanner.nextInt();
        
        practice.showNumberPlus10();
        practice.showNumberPlus100();
        practice.showNumberPlus1000();
        
        
    }
    
}
