package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class BookService {
    public void write(String path, String value) {
        System.out.println("Do you want to write your Audio Book in File?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner sc = new Scanner(System.in);
        try (sc) {
            int i = sc.nextInt();
            if (i == 1) {
                Files.write(Paths.get(path), value.getBytes(), StandardOpenOption.APPEND);
            } else {
                System.out.println("You entered No. Have a nice day :)");
            }
        } catch (IOException e) {
            System.out.println("Exception accrued");
            e.printStackTrace();
        }
    }
}
