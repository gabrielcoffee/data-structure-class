import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ImgFloodFill imgFloodFill = new ImgFloodFill("image.png");
        imgFloodFill.fillByQueue(10, 10, Color.blue);
    }
}