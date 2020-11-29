package model;

import java.util.ArrayList;

public class Author {
    private final String name;
    private int year = 2020;
    private ArrayList<Book> books = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, int year) {
        this.name = name;
        if (year <= 2020)
            this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printInfo() {
        System.out.println("author.name = " + getName() + "\nauthor.birthdate = " + getYear());
        System.out.println("****************");
    }
}
