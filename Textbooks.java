package lab4;

public class Textbooks implements Book {
    private String title;
    private String review;
    private double price;
    private int grade;

    public Textbooks (String title, String review, double price, int grade) {
        this.title = title;
        this.review = review;
        this.price = price;
        this.grade = grade;

    }
    public String getTitle() {
        return title;
    }
    public String getReview() {
        return review;
    }
    public double getPrice() {
        return price;
    }
    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Textbooks{" +
                "title='" + title + '\'' +
                ", review='" + review + '\'' +
                ", price=" + price +
                ", grade=" + grade +
                '}';
    }
}
