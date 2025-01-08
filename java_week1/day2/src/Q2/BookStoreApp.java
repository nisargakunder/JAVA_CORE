package Q2;

public class BookStoreApp {
    public static void main(String[] args) {

        BookStore store = new BookStore();

        store.addbook();
        store.order("456", 10); // Adds a new book (title and author will be prompted)
        store.order("123", 5);  // Adds another new book

        store.Displaydetails();
        store.sell("merchent of venice", 3); // Hardcoded title for testing
        store.sell("Sherlock Holmes", 2); // Another title for testing


        store.Displaydetails();


    }
}
