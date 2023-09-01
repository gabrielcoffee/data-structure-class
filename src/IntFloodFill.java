/*
Implementação do flood fill com inteiros
Para funcionamento se supõe que será passado uma matriz quadrada no construtor
 */

import java.util.Arrays;

public class IntFloodFill {

    private int[][] image;

    public IntFloodFill(int[][] image) {
        this.image = image;
    }

    public void fill(int posX, int posY, int newValue) {
        if (posX >= image.length || posY >= image.length || posX < 0 || posY < 0)
            return;

        int initValue = image[posY][posX];

        StaticStack<Coordinate> stack = new StaticStack<>(image.length * image.length);
        stack.push(new Coordinate(posX, posY));

        while (!stack.isEmpty()) {
            Coordinate coord = stack.pop();
            if (coord.x >= image.length || coord.y >= image.length || coord.x < 0 || coord.y < 0) {

            }
            image[coord.y][coord.x] = newValue;

            stack.push(new Coordinate(posX+1, posY));
            stack.push(new Coordinate(posX-1, posY));
            stack.push(new Coordinate(posX, posY-1));
            stack.push(new Coordinate(posX, posY+1));
        }
    }

    public void print() {
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println();
    }
}
