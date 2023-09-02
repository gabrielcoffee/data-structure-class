public class CircularQueue<T> {

    private int top;
    private int base;
    private T[] data;

    public CircularQueue(int size) {
        this.top =  -1;
        this.base = -1;
        this.data = (T[]) new Object[size];
    }

    public void add(T value) {
        if (isFull()) {
            return;
        }
        if (isEmpty()) {
            base++;
        }
        top = (top + 1) % data.length;
        data[top] = value;
    }

    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T tmp = data[base];
        data[base] = null;

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
                data[i] = null;
            }
        }
        top = -1;
        base = -1;
    }

    public boolean isFull() {
        return (top + 1) % data.length == base;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ": " + this.data[i]);
        }
        System.out.println();
    }
}
