public class StaticStack {

    private int top;
    private int[] data;

    public StaticStack(int size) {
        this.top = -1;
        this.data = new int[size];
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            this.data[top] = data;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int tmp = data[top];
            data[top] = -1;
            top--;
            return tmp;
        }
        return -1;
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                data[i] = -1;
            }
        }
        top = -1;
    }

    private boolean isFull() {
        return top == data.length-1;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
