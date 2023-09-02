/*
Implementação do flood fill com imagem
CRIAR PASTA "results" dentro no projeto para funcionamento
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImgFloodFill {

    private BufferedImage image;
    private int imgNumber;

    public ImgFloodFill(String filename) {
        try {
            this.image = ImageIO.read(new File("assets/" + filename));

        } catch (Exception e) {
            System.out.println("ERRO: arquivo não encontrado");
        }
        System.out.println("Arquivo encontrado com sucesso");

        this.imgNumber = 0;
    }

    public void fillByStack(int posX, int posY, Color newColor) {

        int width = image.getWidth();
        int height = image.getHeight();

        // Checking if position is valid
        if (posX >= width || posY >= height || posX < 0 || posY < 0)
            return;

        // Store initial value and change first
        int initColor = image.getRGB(posX, posY);

        // Storing first position to "paint" with new value
        StaticStack<Coordinate> stack = new StaticStack<>(width * height);
        stack.push(new Coordinate(posX, posY));

        // Looping through all positions in the stack
        while (!stack.isEmpty()) {
            Coordinate coord = stack.pop();

            // Just continue if inside matrix and different value than initial
            if (coord.x >= width || coord.y >= height || coord.x < 0 || coord.y < 0
                    || image.getRGB(coord.x, coord.y) != initColor) {
                continue;
            }

            image.setRGB(coord.x, coord.y, newColor.getRGB());

            saveImage();

            stack.push(new Coordinate(coord.x+1, coord.y));
            stack.push(new Coordinate(coord.x-1, coord.y));
            stack.push(new Coordinate(coord.x, coord.y-1));
            stack.push(new Coordinate(coord.x, coord.y+1));
        }
    }

    public void fillByQueue(int posX, int posY, Color newColor) {

        int width = image.getWidth();
        int height = image.getHeight();

        // Checking if position is valid
        if (posX >= width || posY >= height || posX < 0 || posY < 0)
            return;

        // Store initial value and change first
        int initColor = image.getRGB(posX, posY);

        // Storing first position to "paint" with new value
        CircularQueue<Coordinate> queue = new CircularQueue<>(width * height);
        queue.add(new Coordinate(posX, posY));

        // Looping through all positions in the stack
        while (!queue.isEmpty()) {
            Coordinate coord = queue.remove();

            // Just continue if inside matrix and different value than initial
            if (coord.x >= width || coord.y >= height || coord.x < 0 || coord.y < 0
                    || image.getRGB(coord.x, coord.y) != initColor) {
                continue;
            }

            image.setRGB(coord.x, coord.y, newColor.getRGB());

            saveImage();

            queue.add(new Coordinate(coord.x+1, coord.y));
            queue.add(new Coordinate(coord.x-1, coord.y));
            queue.add(new Coordinate(coord.x, coord.y-1));
            queue.add(new Coordinate(coord.x, coord.y+1));
        }
    }

    public void saveImage() {

        String filename = "result" + imgNumber + ".png";

        try {
            ImageIO.write(image , "png", new File("results/" + filename));
        } catch (Exception e) {
            System.out.println("Erro ao salvar imagem");
        }

        imgNumber++;
    }
}