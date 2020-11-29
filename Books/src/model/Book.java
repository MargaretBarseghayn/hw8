package model;

public abstract class Book {
    private final String name;
    private final Author author;
    private double price = 100;
    private final String genre;
    protected double rating = 0;

    protected int readCount = 0;

    private static final String FILE = "C:\\Users\\Acer\\Desktop\\Book.txt";

    public Book(String name, Author author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 100)
            this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public int getReadCount() {
        return readCount;
    }

    public void read() {
        if (rating < 10)
            rating += 0.1;
    }


    public abstract void startReading();

    public abstract void goTo();

    public abstract void goTo(int count);


}
