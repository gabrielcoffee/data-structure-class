public class StaticStack<T> {

    private int top;
    private T[] data;

    public StaticStack(int size) {
        this.top = -1;
        this.data = (T[]) new Object[size];
    }

    public void push(T data) {
        if (!isFull()) {
            top++;
            this.data[top] = data;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T tmp = data[top];
            data[top] = null;
            top--;
            return tmp;
        }
        return null;
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                data[i] = null;
            }
        }
        top = -1;
    }

    public boolean isFull() {
        return top == data.length-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
