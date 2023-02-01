public class King implements Printable {
    public King(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public void print() {

    }
}
