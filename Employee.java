
package practice;

public class Employee {
    //constructor chaining
    
    String empName; // instance variable
    int empNo; // instance variable
    int age; 
    
    static double sSalary = 10000; // static/class variable
    
    Employee() // non parameterized
    {
        this("Philip"); // must always be first sa constructor, calling other constructor with 1 parameter (String)
       // empName = "unknown";
       // empNo = 0;
        //age = 0;
        
    }
    
    Employee(String name, int age) //parameterized constructor
    {
        
        empName = name;        
        this.age = age; // class member variable, 'this' to refer na you are refering sa employee class
    }
    
    Employee(String name)
    {
        this("Lucas", 23); 
        empName = name;
      //  empNo = 0;
        //age = 0;
    }
    int display(int x)
    {
        return 0;
    }
    
    void display(){
        Employee emd = new Employee("Andres", 43);
       String mensahe = "unknown"; // local variable
        int empNO; // local variable
        sSalary = 15000.50;
     
        System.out.println("Salary = " + sSalary);
        emd.empNo+=2;
        System.out.println("empNo = " + emd.empNo );
        System.out.println("Employee name of emd : " + emd.empName);
    }
    
  
    public static void main(String[] args)
    {
        Employee em = new Employee();
        Employee em1 = new Employee("Juan ", 34); //creating object or instance of the class
        Employee em2 = new Employee("Pedro", 65);
        
       /* int x;
        String name; // local variable    
        em1.display(); 
        em1.empNo++;
        System.out.println("em1 = " + em1.empNo);
        System.out.println("em2 = " + em2.empNo);
        em2.empNo+=5;
        System.out.println("em1 = " + em1.empNo);
        //System.out.println("Salary ng main = " + em2.sSalary);
        System.out.println("em2 = " + em2.empNo);
*/
       
         System.out.println("em Name: " + em.empName);
         System.out.println("em no: " + em.empNo);
         System.out.println("em age: " + em.age);
         System.out.println("");
        
         System.out.println("em Name: " + em1.empName);
         System.out.println("em no: " + em1.empNo);
         System.out.println("em age: " + em1.age);
         System.out.println("");
         
         System.out.println("em Name: " + em2.empName);
         System.out.println("em no: " + em2.empNo);
         System.out.println("em age: " + em2.age);
    }

}