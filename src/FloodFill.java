import java.util.Arrays;

public class FloodFill {

    public int[][] image;
    public int size;

    public FloodFill(int[][] image) {
        this.image = image;
        this.size = image.length;
    }

    public void fill(int posX, int posY) {
        if (posX < size && posY < size && posX > -1 && posY > -1) {

        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }
}
