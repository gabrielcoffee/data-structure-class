public class Person {
    static int amount = 0;
    int id;
    String name;

    public Person(String name) {
        this.name = name;
        this.id = amount;
        amount++;
    }
}