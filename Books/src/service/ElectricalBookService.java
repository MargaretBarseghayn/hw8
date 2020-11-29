package service;

import com.company.BookTasks;
import model.Author;
import model.ElectricalBook;

import java.util.Scanner;

public class ElectricalBookService extends BookService implements BookTasks<ElectricalBook> {

    public ElectricalBook create() {
        System.out.println("Creating an Electrical Book");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter author: ");
        String authorName = sc.nextLine();
        Author author = new Author(authorName);
        System.out.print("Enter genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter location: ");
        int location = sc.nextInt();

        sc.close();

        String var = '\n' + name + "," + authorName + "," + genre + "," + location;
        write(FILE, var);

        return new ElectricalBook(name, author, genre, location);
    }

    @Override
    public void getAuthorInfo(ElectricalBook val) {
        val.getAuthor().printInfo();
    }

    @Override
    public int compareByPrice(ElectricalBook val1, ElectricalBook val2) {
        return Double.compare(val1.getPrice(), val2.getPrice());
    }

    @Override
    public int compareByRating(ElectricalBook val1, ElectricalBook val2) {
        return Double.compare(val1.getRating(), val2.getRating());
    }

    @Override
    public void printInfo(ElectricalBook val) {
        System.out.println("ElectricalBook.name = " + val.getName() + "\nElectricalBook.genre = " + val.getGenre()
                + "\nElectricalBook.author is " + val.getAuthor().getName() + "\nElectricalBook.page = " + val.getLoc()
                + "\nElectricalBook.price is " + val.getPrice());
        System.out.println("****************");
    }
}
