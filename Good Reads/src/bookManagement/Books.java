package bookManagement;

public class Books {
    private final String ISBN;
    private final String title;
    private final String author;
    private final String genre;
    private final double rating;

    public Books(String ISBN, String title, String author, String genre, double rating) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}
