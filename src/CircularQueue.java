// NESTA IMPLEMENTAÇÃO DEFINI VALORES DELETADOS/INDEFINIDOS COMO ZERO

public class CircularQueue {

    private int top;
    private int base;
    private int[] data;

    public CircularQueue(int size) {
        this.top =  -1;
        this.base = -1;
        this.data = new int[size];
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("list is full");
            return;
        }
        if (isEmpty()) {
            base++;
        }
        top = (top + 1) % data.length;
        data[top] = value;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return -1;
        }
        int tmp = data[base];
        data[base] = 0;

        if (base == top) {
            base = -1;
            top = -1;
        }
        else {
            base = (base + 1) % data.length;
        }
        return tmp;
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i < data.length; i++) {
                data[i] = 0;
            }
        }
        top = -1;
        base = -1;
    }

    private boolean isFull() {
        return (top + 1) % data.length == base;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ": " + this.data[i]);
        }
        System.out.println();
    }
}
