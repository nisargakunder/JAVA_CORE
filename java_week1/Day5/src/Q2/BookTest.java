package Q2;

public class BookTest {



        public static void main(String[] args) {
            BookCollection collection = new BookCollection("Alice");

            collection.addBook(new Book("J.K. Rowling", "Harry Potter"));
            collection.addBook(new Book("Cay Horstmann", "Java in Depth"));

            Book searchBook = new Book("Cay Horstmann", "Java in Depth");
            System.out.println("Has book Java in Depth ? " + collection.hasBook(searchBook));
            System.out.println("Before sorting:");
            System.out.println(collection);

            collection.sort();

            System.out.println("After sorting:");
            System.out.println(collection);


        }
    }


