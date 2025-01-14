package Q2;

import java.util.Objects;

public class Book {
    private String Bookname;
    private String author;

    public Book(String author, String bookname) {
        this.author = author;
        Bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Bookname: ").append(Bookname).append(", ");
        s.append("Author: ").append(author);
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(Bookname, book.Bookname) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Bookname, author);
    }
}
