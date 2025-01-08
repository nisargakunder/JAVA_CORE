package Q2;

class Book {
    private String booktitle;
    private String author;
    private String isbn;
    private int Noofcopies;

    public Book(String booktitle, String author, String isbn, int Noofcopies) {
        this.booktitle = booktitle;
        this.author = author;
        this.isbn = isbn;
        this.Noofcopies = Noofcopies;
    }
    public String getBooktitle() {
        return booktitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNoofcopies() {
        return Noofcopies;
    }

    // Setter method to modify the number of copies
    public void setNoofcopies(int Noofcopies) {
        this.Noofcopies = Noofcopies;
    }
    public void Display() {
        System.out.println("Book name: " + this.booktitle + " Author: " + this.author + " ISBN: " + this.isbn +
                " Quantity: " + this.Noofcopies);
    }
}
