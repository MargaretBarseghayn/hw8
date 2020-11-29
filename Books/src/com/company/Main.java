package com.company;

import service.AudioBookService;
import service.AuthorService;
import service.ElectricalBookService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("*********MENU************");
        System.out.println("1. Use Books' functionality");
        System.out.println("2. Use Authors' functionality");
        System.out.println("3. Exit");

        boolean indicator = true;
        Scanner scanner = new Scanner(System.in);
        while (indicator) {
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    bookFunctionality();
                    indicator = false;
                    break;
                case 2:
                    authorFunctionality();
                    indicator = false;
                    break;
                case 3:
                    System.out.println("You've just finished your work. Have a nice day :)");
                    indicator = false;
                    break;
                default:
                    System.out.println("Oops. Try entering something between 1 and 3.");
            }
        }
        scanner.close();
    }

    private static void bookFunctionality() {
        System.out.println("****************Book's Menu****************");
        System.out.println("1. Create Electrical Book");
        System.out.println("2. Create Audio Book");
        System.out.println("3. Exit");


        ElectricalBookService ebs = new ElectricalBookService();
        AudioBookService abs = new AudioBookService();

        Scanner sc = new Scanner(System.in);

        boolean indicator = true;
        while (indicator) {
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    ebs.create();
                    indicator = false;
                    break;
                case 2:
                    abs.create();
                    indicator = false;
                    break;
                case 3:
                    System.out.println("You've just finished your work. Have a nice day :)");
                    indicator = false;
                    break;
                default:
                    System.out.println("Oops. Try entering something between 1 and 3.");
            }
        }
        sc.close();
    }

    private static void authorFunctionality() {
        System.out.println("****************Author's Menu****************");
        System.out.println("1. Create Author");
        System.out.println("2. Exit");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            AuthorService authorService = new AuthorService();
            authorService.createAuthor().printInfo();
        } else {
            System.out.println("You've just finished your work. Have a nice day :)");
        }

        sc.close();
    }
}
