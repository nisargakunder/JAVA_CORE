package Q2;

import java.util.Scanner;


public class BookStore {
    private Book[] books = new Book[10];
    private int count=0;
    public void addbook(){

            if (count < 10) {
                System.out.println("Enter the book title");
                Scanner sc = new Scanner(System.in);
                String title = sc.nextLine();
                System.out.println("Enter the book Author");
                Scanner sc1 = new Scanner(System.in);
                String author = sc1.nextLine();
                System.out.println("Enter the book ISBN");
                Scanner sc2 = new Scanner(System.in);
                String isbn = sc2.nextLine();
                System.out.println("Enter the the number of copies");
                Scanner sc3 = new Scanner(System.in);
                int copies = sc3.nextInt();
                books[count++] = new Book(title, author, isbn, copies);
                System.out.println(title+ "Book Added Successfully");
            }
            else{
                System.out.println("Bookstore is Full");
            }



    }

    public void sell(String booktitle, int quantity) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBooktitle().equals(booktitle)) {
                int currentquantity = books[i].getNoofcopies();
                if (currentquantity >= quantity) {
                    books[i].setNoofcopies(currentquantity - quantity);
                    System.out.println("Sold " + quantity + " copies of '" + booktitle + "'.");
                } else {
                    System.out.println("Not enough copies to sell. Available: " + currentquantity);
                }
                return;
            }

        }
        System.out.println(booktitle+ "book is not found");
    }

    public void order(String isbn,int quantity) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                int currentquantity = books[i].getNoofcopies();
                books[i].setNoofcopies((currentquantity + quantity));
                System.out.println("Order placed!");
                return;
            }
        }
        if (count < 10) {
            System.out.println("Book is not available.Enter the details to order");
            System.out.println("Enter the book title");
            Scanner sc = new Scanner(System.in);
            String title = sc.next();
            System.out.println("Enter the book Author");
            Scanner sc1 = new Scanner(System.in);
            String author = sc1.next();

            books[count] = new Book(title, author, isbn, quantity);
            count++;
            System.out.println("Added new Book");


        } else {
            System.out.println("Cannot Add new book .Bookstore is full");
        }

    }
    public void Displaydetails()
    {
            if (count==0){
                System.out.println("No books in the store");
            }
            else {
                for (int i = 0; i < count; i++) {
                    System.out.println("BookTitle " + books[i].getBooktitle() + "Author " + books[i].getAuthor() + "ISBN " + books[i].getIsbn() + "Number of copies " + books[i].getNoofcopies());

                }
            }
        }

    }

