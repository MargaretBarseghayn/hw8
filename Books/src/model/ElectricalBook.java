package model;

public class ElectricalBook extends Book {
    private int loc = 1000;

    public ElectricalBook(String name, Author author, String genre, int loc) {
        super(name, author, genre);
        if (loc >= 1000)
            this.loc = loc;
    }

    public int getLoc() {
        return loc;
    }

    @Override
    public void startReading() {
        System.out.println("You have just started reading your book");
    }

    @Override
    public void read() {
        System.out.println("You just finished reading your book :)");
        super.read();
    }

    @Override
    public void goTo() {
        if (readCount < loc)
            readCount++;
        else {
            read();
            readCount = loc;
        }
    }

    @Override
    public void goTo(int count) {
        if (readCount + count < loc)
            readCount += count;
        else {
            read();
            readCount = loc;
        }
    }

}
