
package mdpract;


public class Book {
    
    private String Title, Author;
    private int pages;
    
    public Book (String Title, String Author, int pages)
    {
        this.Title = Title;
        this.Author = Author;
        this.pages = pages;
    }
    
    public void displayDetails()
    {
       System.out.println("Title: " + Title + "\nAuthor: " + Author + "\nNumber of Pages: " + pages);
    }
    
    public static void main (String[] args)
    {
         Book book = new Book("The Great Gatsby", "F.Scott Fitzgerald", 180);
         book.displayDetails();
    }
          
}
