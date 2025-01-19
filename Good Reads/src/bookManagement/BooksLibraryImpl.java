package bookManagement;

import java.awt.print.Book;
import java.util.*;

public class BooksLibraryImpl implements BooksLibrary {
    private final Set<Books> books = new HashSet<>();
    private final Map<String, List<Books>> genreMap = new HashMap<>();
    private final Map<String, List<Review>> bookReviews = new HashMap<>();

    @Override
    public void listBooks() {
        System.out.print("\n");
        try{
            if (!books.isEmpty()) {
                for (Books book : books) {
                    System.out.println(book.getTitle());
                }
            }
        }catch (Exception e) {
            System.out.println("No books found");
        }
    }

    @Override
    public void addBook(Books book) {
        try{
            books.add(book);
            if(!genreMap.containsKey(book.getGenre().toLowerCase())) {
                genreMap.put(book.getGenre().toLowerCase(), new ArrayList<>());
            }
            genreMap.get(book.getGenre().toLowerCase()).add(book);
//            System.out.println("Added Book: " + book.getTitle());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getBookNyName(String name) {
        try{
            System.out.print("\n");
            for (Books book : books) {
                if(book.getTitle().equals(name)) {
                    System.out.println("Book found with title: " + book.getTitle() + " | genre: " + book.getGenre() + " | by: " + book.getAuthor() + " | ISBN: " + book.getISBN());

                }
            }
        } catch (Exception e) {
            System.out.println("Book not found");
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getBookNyAuthor(String authorName) {
        try{
            System.out.print("\n");
            for (Books book : books) {;
                if(book.getAuthor().equals(authorName)) {
                    System.out.println("Book found! by: " + book.getAuthor() + " | with title: " + book.getTitle() + " | genre: " + book.getGenre() + " | ISBN: " + book.getISBN());
                }
            }
        } catch (Exception e) {
            System.out.println("Book not found");
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteBook(String name) {
        try{
            books.removeIf(book -> book.getTitle().equals(name));
        } catch (Exception e) {
            System.out.println("Book not found");
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getBooksByGenre(String genre) {
        try{
            System.out.print("\n");
            genre = genre.toLowerCase();
            if (genreMap.containsKey(genre)) {
                System.out.println("Books by Genre : " + genre);
                for(Books book : genreMap.get(genre)) {
                    System.out.println(book.getTitle());
                }
            }
        }catch (Exception e) {
            System.out.println("Genre not available.");
        }
    }

    public void addReview(String bookTitle, Review review) {
        bookReviews.putIfAbsent(bookTitle, new ArrayList<>());
        bookReviews.get(bookTitle).add(review);
        System.out.println("Review added for book: " + bookTitle);
    }

    public void showReviews(String bookTitle) {
        if (bookReviews.containsKey(bookTitle)) {
            System.out.println("Reviews for \"" + bookTitle + "\":");
            for (Review review : bookReviews.get(bookTitle)) {
                System.out.println(review);
            }
        } else {
            System.out.println("No reviews found for book: " + bookTitle);
        }
    }
}
