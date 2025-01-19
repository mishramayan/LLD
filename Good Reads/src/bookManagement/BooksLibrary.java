package bookManagement;

import java.util.List;
import java.util.Set;

public interface BooksLibrary {
    public void listBooks();
    public void addBook(Books book);
    public void getBookNyName(String name);
    public void getBookNyAuthor(String authorName);
    public void deleteBook(String name);
    public void getBooksByGenre(String genre);
}
