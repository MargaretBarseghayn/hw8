package model;

public class AudioBook extends Book {
    private int duration = 4500;

    public AudioBook(String name, Author author, String genre, int duration) {
        super(name, author, genre);
        if (duration >= 4500)
            this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void startReading() {
        System.out.println("You have just started listening your book");
    }

    @Override
    public void read() {
        System.out.println("You just finished listening your book :)");
        super.read();
    }

    @Override
    public void goTo() {
        if (readCount < duration)
            readCount++;
        else {
            read();
            readCount = duration;
        }
    }

    @Override
    public void goTo(int count) {
        if (readCount + count < duration)
            readCount += count;
        else {
            read();
            readCount = duration;
        }
    }
}
