public class YoungerSon extends King implements Printable{
    private int countPuzzles;

    public YoungerSon(int age, String name, int countPuzzles) {
        super(age, name);
        this.countPuzzles = countPuzzles;
    }

    public int getCountPuzzles() {
        return countPuzzles;
    }

    @Override
    public void print() {
        System.out.println(getAge()+" "+getName()+" "+ getCountPuzzles());


    }
}
