public class Main {
    public static void main(String[] args) {
        createObject("OlderSon").print();
        createObject("MiddleSon").print();
        createObject("YoungerSon").print();
    }

    static King createObject(String className) {
        switch (className) {
            case ("MiddleSon"): {
                MiddleSon middleSon = new MiddleSon(20, "Bob", 20);
                return middleSon;
            }
            case ("OlderSon"): {
                OlderSon olderSon = new OlderSon(25, "Jorge", 5);
                return olderSon;
            }
        }
            YoungerSon youngerSon = new YoungerSon(15, "Claus", 25);
            return youngerSon;


    }
}