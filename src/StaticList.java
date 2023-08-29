import java.util.Arrays;

public class StaticList {

    private int[] data;
    private int size;

    public StaticList(int size) {
        this.data = new int[size];
        this.size = size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            // Já que não podemos definir int como null defini que o valor padrão será 0
            data[i] = 0;
        }
    }

    // Adiciona na primeira posição que tiver o valor 0 ("vazio")
    public void add(int value) {
        if (!isFull()) {
            for (int i = 0; i < size; i++) {
                if (data[i] == 0) {
                    data[i] = value;
                }
            }
        }
    }

    public int remove(int pos) {
        if (inBounds(pos)) {
            int tmp;
            tmp = data[pos];

            for (int i = pos; i < size-1; i++) {
                data[pos] = data[pos+1];
            }

            return tmp;
        }
        return -1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (data[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            if (data[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public void setData(int value, int pos) {
        if (inBounds(pos)) {
            data[pos] = value;
        }
        else {
            System.out.println("invalid position");
        }
    }

    public int getData(int pos) {
        if (inBounds(pos)) {
            return data[pos];
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public int find(int value) {
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
