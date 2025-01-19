package bookManagement;

public class Review {
    private final String userName;
    private final String bookTitle;
    private final double rating; // User's rating for the book (1-5 scale)
    private final String reviewText; // User's review text

    public Review(String userName, String bookTitle, double rating, String reviewText) {
        this.userName = userName;
        this.bookTitle = bookTitle;
        this.rating = rating;
        this.reviewText = reviewText;
    }

    public String getUserName() {
        return userName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getRating() {
        return rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    @Override
    public String toString() {
        return "Review by " + userName + " for \"" + bookTitle + "\": " +
                "Rating: " + rating + "/5, Review: " + reviewText;
    }
}
