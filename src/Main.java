import java.awt.*;

public class Main {

    public static void main(String[] args) {

        HashTable htable = new HashTable(5);

        htable.add("Joao", new Person("Joao"));
        htable.add("Gabriel", new Person("Gabriel"));
        htable.add("Amanda", new Person("Amanda"));
        htable.add("Cleber", new Person("Cleber"));
        htable.add("Junior", new Person("Junior"));

        htable.print();

        System.out.println();

        htable.remove("Joao");
        htable.add(501, new Person("Vagner"));

        htable.print();
    }
}