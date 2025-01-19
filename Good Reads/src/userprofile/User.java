package userprofile;

import bookManagement.Books;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String name;
    private final int age;
    private final String gender;
    private final String email;
    private final String preferred_genre;

    private final Set<Books> readBooks;
    private final Set<Books> wantedBooks;
    private Books favouriteBook;

    public User(String name, int age, String gender, String email, String preferred_genre) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.preferred_genre = preferred_genre;

        this.readBooks = new HashSet<>();
        this.wantedBooks = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPreferred_genre() {
        return preferred_genre;
    }

    public void getReadBooks() {
        for (Books book : readBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void getWantedBooks() {
        for (Books book : wantedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public String getFavouriteBook() {
        return favouriteBook.getTitle();
    }

    public void addBookToRead(Books book) {
        readBooks.add(book);
    }

    public void addBookToWanted(Books book) {
        wantedBooks.add(book);
    }

    public void setFavouriteBook(Books book) {
        this.favouriteBook = book;
    }
}
