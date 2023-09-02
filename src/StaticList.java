import java.util.Arrays; // utilizado para printar

public class StaticList<T> {

    private T[] data;
    private int size;

    public StaticList(int size) {
        this.data = (T[]) new Object[size];
        this.size = size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
    }

    public void add(T value) {
        if (!isFull()) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    data[i] = value;
                }
            }
        }
    }

    public T remove(int pos) {
        if (inBounds(pos)) {
            T tmp = data[pos];

            for (int i = pos; i < size-1; i++) {
                data[pos] = data[pos+1];
            }

            return tmp;
        }
        return null;
    }

    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (data[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            if (data[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void setData(T value, int pos) {
        if (inBounds(pos)) {
            data[pos] = value;
        }
        else {
            System.out.println("invalid position");
        }
    }

    public T getData(int pos) {
        if (inBounds(pos)) {
            return data[pos];
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public int find(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Pequena função que fiz para conferir se uma posição está dentro do alcance do array
    public boolean inBounds(int pos) {
        return pos > -1 && pos < size;
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
