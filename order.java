
package practice;

public class order {
    
    String item;
    int price;
    int quantity;
  

    public order(String item, int price)
    {
        this.item = item;
        this.price = price;
    }   
     public order (String item, int price, int quantity)
     {
         this.item = item;
         this.price = price;
         this.quantity = quantity;
     }
      
      
      void askPrice()
      {
          System.out.println("The price of " + this.item + " is " + getPrice()); 
      }
      
      void productsPrice()
      {
          System.out.println("What products are available with " + this.price + " peso price");
      }
      
      void allInfo()
      {
          System.out.println(this.quantity + "pieces of " + this.item + " is " + this.price );
      }
          
      void eachPrice()
              {
              System.out.println("The price of " + this.item + " is " + this.price + " each");
              }
          
       // Getter for name
    public String getName() {
        return this.item;
    }

    // Setter for name
    public void setName(String name) {
        this.item = item;
    }

    // Getter for price
    public double getPrice() {
        return this.price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }
}