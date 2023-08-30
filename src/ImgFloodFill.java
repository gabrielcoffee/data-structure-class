/*
Implementação do flood fill com imagem
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImgFloodFill {

    private BufferedImage image;
    private int width;
    private int height;
    private Color initColor;
    private int imgNumber;

    public ImgFloodFill(String filename) {
        try {
            this.image = ImageIO.read(new File("assets/" + filename));
            this.width = image.getWidth();
            this.height = image.getHeight();
        } catch (Exception e) {
            System.out.println("ERRO: arquivo não encontrado");
        }
        System.out.println("Arquivo encontrado com sucesso");

        this.imgNumber = 1;

        this.initColor = null;
    }

    public void fill(int posX, int posY, Color newColor) {

        // Definimos a cor inicial se ainda não foi definida
        if (initColor == null) {
            initColor = new Color(image.getRGB(posX, posY));
        }

        // Conferimos se a posição passada na função é inválida para acessar em nossa imagem
        if (posX >= width || posY >= height || posX < 0 || posY < 0)
            return;
        // Conferimos se o valor da cor na posição passada é diferente do valor inicial para saber se devemos mudar ou não
        if (image.getRGB(posX, posY) != initColor.getRGB())
            return;

        // Mudamos de fato a cor na posição atual
        image.setRGB(posX, posY, newColor.getRGB());

        // Usamos nossa propria função saveImage para salvar um arquivo da imagem
        saveImage();

        // Executamos a mesma função, mas nos valores dos 4 lados ao redor do atual (função é recursiva)
        fill(posX, posY-1, newColor);
        fill(posX, posY+1, newColor);
        fill(posX-1, posY, newColor);
        fill(posX+1, posY, newColor);
    }

    public void saveImage() {

        String filename = "result" + imgNumber + ".jpg";

        try {
            ImageIO.write(image , "jpg", new File("results/" + filename));
        } catch (Exception e) {
            System.out.println("Erro ao salvar imagem");
        }

        imgNumber++;
    }
}