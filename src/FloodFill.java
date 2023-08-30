import java.util.Arrays;

public class FloodFill {

    private int[][] image;
    private int size;
    private int initValue;

    public FloodFill(int[][] image) {
        this.image = image;
        this.size = image.length;
        this.initValue = -1;
    }

    public void fill(int posX, int posY, int newValue) {

        // Definimos o valor inicial se ainda não foi definido
        if (initValue == -1) {
            initValue = image[posY][posX];
        }

        // Conferimos se a posição passada na função é inválida para acessar em nosso array 2D
        if (posX >= size || posY >= size || posX < 0 || posY < 0)
            return;
        // Conferimos se o valor na posição passada é diferente do valor inicial para saber se devemos mudar ou não
        if (image[posY][posX] != initValue)
            return;

        // Mudamos de fato o valor na posição atual
        image[posY][posX] = newValue;

        // Usamos nossa propria função print para mostrar toda a matriz (image)
        print();
        System.out.println();

        // Executamos a mesma função mas nos valores dos 4 lados ao redor do atual (função é recursiva)
        fill(posX, posY-1, newValue);
        fill(posX, posY+1, newValue);
        fill(posX-1, posY, newValue);
        fill(posX+1, posY, newValue);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }
}
