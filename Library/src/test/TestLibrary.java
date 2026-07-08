package test;

import clasesFinal.ISBN;
import library.Book;
import library.Library;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(
                new Book(new ISBN("1235481567842"),
                        "La musa",
                        "polinesios")
                //objeto anonimo
        );
        library.addBook(
                new Book(new ISBN("1235481567842"),
                        "Spring in Action",
                        "polinesios")
                //objeto anonimo
        );
        library.addBook(
                new Book(new ISBN("1235481564511"),
                        "Java",
                        "Craing walls")
                //objeto anonimo
        );

        library.showBooks();
        System.out.println("****Buscar******");
        System.out.println(library.findBook(new ISBN("1235481564511")));
        System.out.println("****Mayor titulo****");
        System.out.println(library.logesBook());
        System.out.println("***Total autores***");
        System.out.println("Total autores: "+library.countAuthors());
        System.out.println("****ISBN unicos");
        ISBN[] uniques = library.uniqueISBNs();
        for (ISBN isbn : uniques) {
            System.out.println(isbn);
        }

    }
}
