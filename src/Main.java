import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /*
        // Matriz exemplo com int
        int[][] image = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                         {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                         {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                         {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                         {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                         {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                         {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                         {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                         {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                         {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        IntFloodFill floodfill = new IntFloodFill(image);

        floodfill.fill(7, 7, 2);
        */

        // Matriz exemplo com imagem
        String filename = "image.png";
        ImgFloodFill imgFloodFill = new ImgFloodFill(filename);

        Color newColor = Color.yellow;
        imgFloodFill.fill(20,  20, newColor);
    }
}