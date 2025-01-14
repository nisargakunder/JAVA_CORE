package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator for sorting by title and author
class SortByTitleAndAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int title = o1.getBookname().compareTo(o2.getBookname());
        if (title != 0) {
            return title; // If titles are different, return the comparison result
        }
        return o1.getAuthor().compareTo(o2.getAuthor()); // Compare authors if titles are the same
    }
}

public class BookCollection {
    private String name;
    private List<Book> books = new ArrayList<>();

    public BookCollection(String name) {
        this.name = name;
    }

    // Getter and setter for owner's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add a book to the collection
    public void addBook(Book book) {
        books.add(book);
    }

    // Check if a specific book exists in the collection
    public boolean hasBook(Book b) {
        for (Book book : books) {
            if (book.equals(b)) { // Assumes Book class overrides equals() properly
                return true;
            }
        }
        return false;
    }

    // Sort books by title and author
    public void sort() {
        Collections.sort(books, new SortByTitleAndAuthor());
    }

    // Output books in a nice format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner: ").append(name);
        for (Book book : books) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

}
