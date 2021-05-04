package lab4;

public class HistoricalBooks implements Book {

    private String title;
    private double price;
    private String author;

    public HistoricalBooks (String title, String review, double price, String author) {
        this.title = title;

        this.price = price;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "HistoricalBooks{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}

