public class OlderSon extends  King implements Printable {
private int readBooks;

    public OlderSon(int age, String name, int readBooks) {
        super(age, name);
        this.readBooks = readBooks;
    }

    public int getReadBooks() {
        return readBooks;
    }

    @Override
    public void print() {
        System.out.println(getAge()+" "+getName()+" "+getReadBooks() );

    }
}
