/*

CASO ENCONTRAREM ALGUM ERRO OU ALGO QUE POSSA MELHORAR POR FAVOR ME COMUNICAR
 PARA MIM PODER ATUALIZAR O REPOSITÓRIO

 CÓDIGO POR GABRIEL FERNANDES

 */

public class DoubleLinkedList<T> {
    public Node<T> base;
    public Node<T> top;
    private int size;

    public DoubleLinkedList() {
        base = null;
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return base == null && top == null;
    }

    public int getSize() {
        return this.size;
    }

    public void add(T value) {
        Node<T> newNode = new Node<T>(value);

        if (isEmpty()) {
            base = newNode;
            top = newNode;
        }
        else {
            newNode.previous = top;
            top.next = newNode;
            top = newNode;
        }

        size++;
    }

    public T remove(int pos) {
        if (!isEmpty() && inBounds(pos)) {

            int i = 0;
            Node<T> cur = base;

            // Loop até cur ser o node da posição que desejamos remover
            while(i != pos) {
                if (cur.next != null) {
                    cur = cur.next;
                    i++;
                }
            }

            // Salvamos o valor do nó que estamos removendo
            T tmp = cur.data;

            handleRemoval(cur);

            // Depois retornar o valor que tinha na posição removida
            return tmp;
        }
        return null;
    }

    public T removeNode(Node<T> node) {
        if (!isEmpty() && node != null) {

            T tmp = node.data;
            Node<T> cur = base;
            int i = 0;

            while (i < size) {
                if (cur == node) {
                    break;
                }
                if (cur.next != null) {
                    cur = cur.next;
                    i++;
                } else {
                    System.out.println("not found");
                    return null;
                }
            }

            handleRemoval(cur);

            return tmp;
        }
        return null;
    }

    private void handleRemoval(Node<T> cur) {
        // Se havia apenas um nó resetar a lista
        if (size == 1) {
            base = null;
            top = null;
            size = 0;
        }
        // Se havia mais de um tratar cada possibilidade de ser o nó do topo, base ou meio
        else {
            if (top == cur) {
                top = cur.previous;
                top.next = null;
            }
            else if (base == cur) {
                base = cur.next;
                base.previous = null;
            }
            else {
                cur.previous.next = cur.next;
                cur.next.previous = cur.previous;
            }
        }
        size--;
    }


    public Node<T> getNode(int pos) {
        if (!isEmpty() && inBounds(pos)) {

            int i = 0;
            Node<T> cur = base;

            while(i < size) {
                if (i == pos) {
                    return cur;
                }

                cur = cur.next;
                i++;
            }
        }
        return null;
    }

    // Já que na função superior já procuramos um node (nó) iterando por todos
    // os nós da lista até chegar em uma posição, aqui podemos utilizar o
    // resultado que essa função retorna e selecionar o data (dado do nó)
    public T get(int pos) {
        Node<T> node = getNode(pos);
        if (node != null) {
            return node.data;
        }
        else {
            return null;
        }
    }

    public void set(int pos, T value) {
        if (inBounds(pos) && value != null) {
            Node<T> cur = base;
            int i = 0;

            while(i < pos) {
                cur = cur.next;
                i++;
            }

            Node<T> newNode = new Node<T>(value);
            newNode.previous = cur.previous;
            newNode.next = cur;
            cur.previous = newNode;

            if (i == 0) {
                base = newNode;
            }
            else if (i == size-1) {
                top = newNode;
            }
        }
    }

    private boolean inBounds(int pos) {
        if (pos > -1 && pos < size) {
            return true;
        }
        else {
            System.out.println("numero invalido");
            return false;
        }

    }

    public void print() {

        int i = 0;
        Node cur = base;

        while (i < size) {

            System.out.println(i + ": " + cur.data);

            cur = cur.next;
            i++;
        }
        System.out.println();
    }


    // IMPLEMENTAÇÃO DA CLASSE NODE (NÓ)
    public static class Node<T> {
        public Node<T> previous;
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
}
