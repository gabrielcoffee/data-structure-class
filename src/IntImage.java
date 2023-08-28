import java.util.Arrays;

public class IntImage {

    public int[][] image;
    public int size;

    public IntImage(int[][] image) {
        this.image = image;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }
}
