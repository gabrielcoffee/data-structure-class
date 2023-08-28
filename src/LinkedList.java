public class LinkedList {
    public Node base;
    public Node top;
    int size;

    // IMPLEMENTAÇÃO DA CLASSE NODE (NÓ)
    public static class Node {
        public Node previous;
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
