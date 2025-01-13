package Q4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        int i = 0;
        List<Book> books = new ArrayList<>();
        String s = null;
        try (BufferedReader b = new BufferedReader(new FileReader(new File("sample.txt")))) {
            while ((s = b.readLine()) != null) {
                String[] arr = s.split(":");

                if (!arr[0].isEmpty() && !arr[1].isEmpty() && !arr[2].isEmpty() && !arr[3].isEmpty() && !arr[4].isEmpty() && !arr[5].isEmpty()) {
                    books.add(new Book(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Double.parseDouble(arr[4]), Integer.parseInt(arr[5])));
                } else {
                    System.out.println("Invalid format");
                }


            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("No contents found");

        }
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println(searchBook(books, 121));
        sellbook("java", 2, books);
        System.out.println("Updated List");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Updated List after purchasing");
        purchasebook("java",2,books);
        for (Book book : books) {
            System.out.println(book);
        }

    }


    public static Book searchBook(List<Book> books, int bookId) {
        boolean Found = false;
        Book bookFound = null;

        for (Book book : books) {
            if (book.getId() == bookId) {
                Found = true;
                bookFound = book;
                break;
            }
        }
        if (Found)
            return bookFound;
        else
            throw new BookNotFoundException("Book with id " + bookId + " Not Found");
    }

    public static void sellbook(String isbn, int noofcopies, List<Book> books) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.getNoofcopies() > noofcopies) {
                    int temp=book.getNoofcopies() - noofcopies;
                    book.setNoofcopies(temp);
                } else {
                    throw new NotenoughCopies("Not enough copies of " + book.getTitle());
                }
            }
        }

    }

    public static void purchasebook(String isbn, int noofcopies,List<Book> books) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setNoofcopies(book.getNoofcopies() + noofcopies);
            }
        }
    }

}
