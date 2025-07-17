package com.mycompany.librarySystem.model;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private final String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    // Full constructor
    public Book(String isbn, String title, String author, String genre) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be empty");
        }
        this.isbn = isbn;
        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.available = true;
    }
    
    // Overloaded constructor: minimal info
    public Book(String isbn) {
        //Constructor Chaining
        //By using this(); in the first line of the constructor it indicates 
        //To java to use Full contructor instead of default super(); constructor 
        
        // Chainned to Full Contructor, this(); calls a constructor within the class
        //this(isbn, null, null, null);
        
        // not Chainned to Full Contructor will call super();
        
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;     
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isBlank()) {
            throw new IllegalArgumentException("Genre cannot be empty");
        }
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    /* --Anemic Model--
    public void setAvailable(boolean available) {
        this.available = available;
    }
    */

    public void checkout() {
        if (!available) {
            throw new IllegalStateException("The book is already checked out");
        }
        available = false;
    }

    public void returnToShelf() {
        if (available) {
            throw new IllegalStateException("The book is already available");
        }
        available = true;
    }

    @Override
    public String toString() {
        return "Book{" +
               "isbn='" + isbn + '\'' +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", genre='" + genre + '\'' +
               ", available=" + available +
               '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Quick checks: same reference or wrong type
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        // 2. Cast and compare the unique field
        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
    
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}