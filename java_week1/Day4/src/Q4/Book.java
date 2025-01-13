package Q4;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int noofcopies;

    public Book(int id, String isbn, String title, String author, double price,int noofcopies) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.noofcopies = noofcopies;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public int getNoofcopies() {
        return noofcopies;
    }

    public void setNoofcopies(int noofcopies) {
        this.noofcopies = noofcopies;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", noofcopies=" + noofcopies + "]";
    }


}
