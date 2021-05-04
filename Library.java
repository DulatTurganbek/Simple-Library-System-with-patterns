package lab4;


import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static Library library;

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {}

    public static Library setLibrary() {
        if (library == null) {
            library = new Library();
        }
        return library;
    }

    public void addBook (Book book) {
        books.add(book);
        System.out.println("Book is added");
    }

    public Book borrowBook (String title) {
        for(Book i : books) {
            if (i instanceof Textbooks ) {
                if (((Textbooks) i).getTitle().equals(title)) {
                    books.remove(i);
                    System.out.println("Done");
                    return i;
                }
            }
            else if (i instanceof HistoricalBooks ) {
                if (((HistoricalBooks) i).getTitle().equals(title)) {
                    books.remove(i);
                    System.out.println("Done");
                    return i;
                }
            }
        }
        System.out.println("Book not found");
        return null;
    }


    public void printBooks() {
        for ( Book i : books) {
            if (i instanceof HistoricalBooks) {
                System.out.println(i.toString());
            }
            else if (i instanceof Textbooks) {
                System.out.println(i.toString());
            }
        }
    }
}

