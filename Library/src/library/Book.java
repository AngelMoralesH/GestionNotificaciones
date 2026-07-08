package library;

import clasesFinal.ISBN;

public class Book {
    private ISBN isbn;
    private String title;
    private String autor;

    public Book(ISBN isbn, String title, String autor) {
        this.isbn = isbn;
        this.title = title;
        this.autor = autor;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
