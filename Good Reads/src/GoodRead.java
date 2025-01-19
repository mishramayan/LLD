import bookManagement.Books;
import bookManagement.BooksLibrary;
import bookManagement.BooksLibraryImpl;
import bookManagement.Review;
import userprofile.User;

public class GoodRead {
    public static void main(String[] args) {
        BooksLibrary booksLibrary = new BooksLibraryImpl();

        // Fantasy
        booksLibrary.addBook(new Books("978-0547928227", "The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.0));
        booksLibrary.addBook(new Books("978-0547928228", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 4.79));
        booksLibrary.addBook(new Books("978-0547928229", "Harry Potter and the Goblet of Fire", "J.K. Rowling", "Fantasy", 4.88));
        booksLibrary.addBook(new Books("978-0547928220", "A Game of Thrones", "George R.R. Martin", "Fantasy", 3.88));
        booksLibrary.addBook(new Books("978-0765377135", "Mistborn: The Final Empire", "Brandon Sanderson", "Fantasy", 4.01));

        // Science Fiction
        booksLibrary.addBook(new Books("978-0441013593", "Dune", "Frank Herbert", "Science Fiction", 3.4));
        booksLibrary.addBook(new Books("978-0441569595", "Neuromancer", "William Gibson", "Science Fiction", 4.1));
        booksLibrary.addBook(new Books("978-0553293357", "Foundation", "Isaac Asimov", "Science Fiction", 2.4));
        booksLibrary.addBook(new Books("978-0553283686", "Hyperion", "Dan Simmons", "Science Fiction", 1.78));
        booksLibrary.addBook(new Books("978-0553380958", "Snow Crash", "Neal Stephenson", "Science Fiction", 4.3));

        // Mystery
        booksLibrary.addBook(new Books("978-0307949486", "The Girl with the Dragon Tattoo", "Stieg Larsson", "Mystery", 5.0));
        booksLibrary.addBook(new Books("978-0307588371", "Gone Girl", "Gillian Flynn", "Mystery", 4.99));
        booksLibrary.addBook(new Books("978-0307474278", "The Da Vinci Code", "Dan Brown", "Mystery", 3.77));
        booksLibrary.addBook(new Books("978-0143113492", "In the Woods", "Tana French", "Mystery", 4.66));
        booksLibrary.addBook(new Books("978-0425274866", "Big Little Lies", "Liane Moriarty", "Mystery", 3.3));

        // Romance
        booksLibrary.addBook(new Books("978-1503290563", "Pride and Prejudice", "Jane Austen", "Romance", 5.0));
        booksLibrary.addBook(new Books("978-0143124542", "Me Before You", "Jojo Moyes", "Romance", 4.2));
        booksLibrary.addBook(new Books("978-0446605236", "The Notebook", "Nicholas Sparks", "Romance", 4.9));
        booksLibrary.addBook(new Books("978-0440212560", "Outlander", "Diana Gabaldon", "Romance", 4.0));
        booksLibrary.addBook(new Books("978-0062439598", "The Hating Game", "Sally Thorne", "Romance", 1.11));

        // Horror
        booksLibrary.addBook(new Books("978-0307743657", "The Shining", "Stephen King", "Horror", 4.33));
        booksLibrary.addBook(new Books("978-0486411095", "Dracula", "Bram Stoker", "Horror", 3.99));
        booksLibrary.addBook(new Books("978-1501142970", "It", "Stephen King", "Horror", 5.0));
        booksLibrary.addBook(new Books("978-0486282114", "Frankenstein", "Mary Shelley", "Horror", 4.11));
        booksLibrary.addBook(new Books("978-0143039983", "The Haunting of Hill House", "Shirley Jackson", "Horror", 4.67));

        // Retrieve books
        booksLibrary.getBookNyAuthor("J.K. Rowling");
        booksLibrary.getBooksByGenre("Science Fiction");
        booksLibrary.getBookNyName("Dune");

        // User Management
        User user = new User("John Doe", 25, "Male", "johndoe@example.com", "Fantasy");
        Books book1 = new Books("978-0547928227", "The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.0);
        Books book2 = new Books("978-0547928228", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 4.79);

        user.addBookToRead(book1);
        user.addBookToWanted(book2);
        user.setFavouriteBook(book1);

        System.out.println("\nBooks Read by User: " );
        user.getReadBooks();
        System.out.println("Books Wanted by User: ");
        user.getWantedBooks();
        System.out.println("Favorite Book: " + user.getFavouriteBook());

        // Ratings and Reviews
        BooksLibraryImpl booksLibraryImpl = new BooksLibraryImpl();
        booksLibraryImpl.addBook(book1);

        Review review1 = new Review("John Doe", "The Hobbit", 5.0, "An amazing classic!");
        Review review2 = new Review("Jane Doe", "The Hobbit", 4.5, "A timeless tale.");

        booksLibraryImpl.addReview("The Hobbit", review1);
        booksLibraryImpl.addReview("The Hobbit", review2);

        System.out.println();
        booksLibraryImpl.showReviews("The Hobbit");
    }
}
