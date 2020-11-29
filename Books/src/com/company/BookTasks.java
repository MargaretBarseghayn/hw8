package com.company;

public interface BookTasks<T> {
    public static final String FILE = "C:\\Users\\Acer\\Desktop\\Book.txt";

    T create();

    void getAuthorInfo(T val);

    int compareByPrice(T val1, T val2);

    int compareByRating(T val1, T val2);

    void printInfo(T val);
}
