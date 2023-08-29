/*

!!!NOTA IMPORTANTE!!
ESSA IMPLEMENTAÇÃO DA MINHA CIRCULAR QUEUE TEM UM DETALHE DIFERENTE:
AO ADICIONAR ALGUM NÚMERO COM A LISTA CHEIA ELA ADICIONA NA POSIÇÃO DO
PRIMEIRO NÚMERO A TER SIDO ADICIONADO OU SEJA O MAIS ANTIGO

TEM VARIAS IMPLEMENTAÇÕES E VIDEOS NA INTERNET MOSTRANDO COMO IMPLEMENTAR
DA FORMA NORMAL (QUE É DE FATO O QUE A PROFESSORA PEDIU)

MAS SE TIVEREM ALGUMA DÚVIDA SEMPRE PODEM ME CHAMAR NO DISCORD https://discord.gg/n4JwA7nF
E SE PRECISAR DE UMA CALL POSSO ATENDER DAS 8H AS 9H NA TERÇA OU AS VEZES QUALQUER DIA A NOITE

GABRIEL FERNANDES

 */

public class CircularQueue {

    private int top;
    private int base;
    private int[] data;
    private int size;

    public CircularQueue(int size) {
        this.top =  -1;
        this.base = -1;
        this.size = size;
        this.data = new int[size];
    }

    public void add(int data) {
        if (isEmpty()) {
            base = 0;
        }

        if (isFull()) {
            base = (base + 1) % size;
        }

        top = (top + 1) % size;
        this.data[top] = data;
    }

    public int remove() {
        if (!isEmpty()) {
            int tmp = data[base];
            this.data[base] = -1;
            base = (base + 1) % size;
            return tmp;
        }

        return -1;
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                data[i] = -1;
            }
        }
        top = -1;
        base = -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + this.data[i]);
        }
        System.out.println();
    }

    private boolean isFull() {
        if ((top + 1) % size == base) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if (base == -1 && top == -1) {
            return true;
        }
        return false;
    }
}
