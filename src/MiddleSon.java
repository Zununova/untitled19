public class MiddleSon extends King implements Printable {
    private int countExercise;

    public int getCountExercise() {
        return countExercise;
    }

    @Override
    public void print() {
        System.out.println(getAge()+" "+getName()+" " + getCountExercise());
    }

    public MiddleSon(int age, String name, int countExercise) {
        super(age, name);
        this.countExercise = countExercise;
    }
}
