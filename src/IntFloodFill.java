/*
Implementação do flood fill com array 2d de inteiros
Para funcionamento se supõe que será passado uma matriz quadrada no construtor
 */

import java.util.Arrays;

public class IntFloodFill {

    private int[][] image;

    public IntFloodFill(int[][] image) {
        this.image = image;
    }

    public void fillByStack(int posX, int posY, int newValue) {

        // Checking if position is valid
        if (posX >= image.length || posY >= image.length || posX < 0 || posY < 0)
            return;

        // Store initial value and change first
        int initValue = image[posY][posX];

        // Storing first position to "paint" with new value
        StaticStack<Coordinate> stack = new StaticStack<>(image.length * image.length);
        stack.push(new Coordinate(posX, posY));

        // Looping through all positions in the stack
        while (!stack.isEmpty()) {
            Coordinate coord = stack.pop();

            // Just continue if inside matrix and different value than initial
            if (coord.x >= image.length || coord.y >= image.length || coord.x < 0 || coord.y < 0
                    || image[coord.y][coord.x] != initValue) {
                continue;
            }

            image[coord.y][coord.x] = newValue;

            print();

            stack.push(new Coordinate(coord.x+1, coord.y));
            stack.push(new Coordinate(coord.x-1, coord.y));
            stack.push(new Coordinate(coord.x, coord.y-1));
            stack.push(new Coordinate(coord.x, coord.y+1));
        }
    }

    public void fillByQueue(int posX, int posY, int newValue) {

        // Checking if position is valid
        if (posX >= image.length || posY >= image.length || posX < 0 || posY < 0)
            return;

        // Store initial value and change first
        int initValue = image[posY][posX];

        // Storing first position to "paint" with new value
        CircularQueue<Coordinate> queue = new CircularQueue<>(image.length * image.length);
        queue.add(new Coordinate(posX, posY));

        // Looping through all positions in the stack
        while (!queue.isEmpty()) {
            Coordinate coord = queue.remove();

            // Just continue if inside matrix and different value than initial
            if (coord.x >= image.length || coord.y >= image.length || coord.x < 0 || coord.y < 0
                    || image[coord.y][coord.x] != initValue) {
                continue;
            }

            image[coord.y][coord.x] = newValue;

            print();

            queue.add(new Coordinate(coord.x+1, coord.y));
            queue.add(new Coordinate(coord.x-1, coord.y));
            queue.add(new Coordinate(coord.x, coord.y-1));
            queue.add(new Coordinate(coord.x, coord.y+1));
        }
    }

    public void print() {
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println();
    }
}
