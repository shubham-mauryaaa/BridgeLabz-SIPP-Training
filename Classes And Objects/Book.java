package OOps_Basic;

public class Book {
    public static void main(String[] args) {
        bookDetails book1 = new bookDetails("The Alchemist", "Paulo Coelho", 300);
        bookDetails book2 = new bookDetails("1984", "George Orwell", 250);
        bookDetails book3 = new bookDetails("To Kill a Mockingbird", "Harper Lee", 400);

        System.out.println("Book 1: " + book1.bookName + ", Author: " + book1.authorName + ", Price: " + book1.price);
        System.out.println("Book 2: " + book2.bookName + ", Author: " + book2.authorName + ", Price: " + book2.price);
        System.out.println("Book 3: " + book3.bookName + ", Author: " + book3.authorName + ", Price: " + book3.price);
    }
    
}

class bookDetails{
    String bookName;
    String authorName;
    int price;
    bookDetails(String bookName, String authorName, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
}