import java.awt.*;

public class Main {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.add(50);
        bt.add(30);
        bt.add(70);
        bt.add(20);
        bt.add(40);
        bt.add(60);
        bt.add(80);
        bt.add(15);

        bt.print();

        bt.remove(50);

        bt.print();
    }
}