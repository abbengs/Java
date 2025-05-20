public class BookClass {

       String title;
       String author;
       double price;

       // Constructor
       public BookClass(String title, String author, double price){

       this.title = title;
       this.author = author;
       this.price = price;
      }

       // Method to display book details
       public void displayDetails() {
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("Price: $" + price);
     }
}

 class Main
 {
       public static void main(String[] args)
  	   {

       // Create a Book object
       BookClass bookl = new BookClass("Horton Hears a Who!", "Mengvi Gatpandan", 15.99);
       BookClass book2 = new BookClass("The Cat in the Hat", "Mary Ann Taduyo", 10.99);
       // Display book details
       bookl.displayDetails();
       System.out.println();
       book2.displayDetails();
       
       }
  
}


