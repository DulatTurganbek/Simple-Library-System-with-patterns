package lab4;

import java.awt.print.Book;
import java.util.List;

public abstract class User {

    private int ID;
    private String username;
    private List<Book> borrowedBooks;
    public User(int id, String username) {
        this.ID = id;
        this.username = username;
    }
    void borrow(Book book) {

        this.borrowedBooks.add(book);
    }

    public double calculate(){ }

    public int getID() {
        return ID;
    }

    public String getUsername() {

        return username;
    }

}
