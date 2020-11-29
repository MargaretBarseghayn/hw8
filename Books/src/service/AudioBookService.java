package service;

import com.company.BookTasks;
import model.AudioBook;
import model.Author;

import java.util.Scanner;

public class AudioBookService extends BookService implements BookTasks<AudioBook> {

    @Override
    public AudioBook create() {
        System.out.println("Creating an Audio Book");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter author: ");
        String authorName = sc.nextLine();
        Author author = new Author(authorName);
        System.out.print("Enter genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter duration: ");
        int duration = sc.nextInt();

        sc.close();

        String var = '\n' + name + "," + authorName + "," + genre + "," + duration;
        write(FILE, var);

        return new AudioBook(name, author, genre, duration);
    }

    @Override
    public void getAuthorInfo(AudioBook val) {
        val.getAuthor().printInfo();
    }

    @Override
    public int compareByPrice(AudioBook val1, AudioBook val2) {
        return Double.compare(val1.getPrice(), val2.getPrice());
    }

    @Override
    public int compareByRating(AudioBook val1, AudioBook val2) {
        return Double.compare(val1.getRating(), val2.getRating());
    }

    @Override
    public void printInfo(AudioBook val) {
        System.out.println("AudioBook.name = " + val.getName() + "\nAudioBook.genre = " + val.getGenre()
                + "\nAudioBook.author is " + val.getAuthor().getName() + "\nAudioBook.page = " + val.getDuration()
                + "\nAudioBook.price is " + val.getPrice());
        System.out.println("****************");
    }
}
