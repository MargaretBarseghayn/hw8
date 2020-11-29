package service;

import model.Author;

import java.util.Scanner;

public class AuthorService {
    public Author createAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter birth year: ");
        int year = sc.nextInt();

        return new Author(name, year);

    }
}
