
public class Main {

    public static void main(String[] args) {

        // Matriz exemplo
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

        FloodFill floodfill = new FloodFill(image);

        floodfill.fill(7, 7, 5);
    }
}