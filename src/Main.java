
public class Main {

    public static void main(String[] args) {

        CircularQueue cqueue = new CircularQueue(4);

        cqueue.add(1);
        cqueue.print();

        cqueue.add(2);
        cqueue.print();

        cqueue.add(3);
        cqueue.print();

        cqueue.add(4);
        cqueue.print();

        cqueue.add(5);
        cqueue.print();

        cqueue.add(6);
        cqueue.print();

        cqueue.add(7);
        cqueue.print();

        cqueue.clear();
        cqueue.print();

        cqueue.add(1);
        cqueue.print();

        cqueue.add(2);
        cqueue.print();

    }
}