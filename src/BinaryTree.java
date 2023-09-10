// OBS: Não escrevi o código para printar a Árvore Binária, encontrei no StackOverFlow e deixei o link no arquivo "TreeFormatter"

public class BinaryTree {

    private Node root;
    private int depthMax;
    private int depthCounter;

    private Node insert(Node parent, int data) {
        if (parent == null) {
            return new Node(data);
        }

        if (data < parent.data) {
            depthCounter++;
            parent.left = insert(parent.left, data);
        }
        else if (data > parent.data) {
            depthCounter++;
            parent.right = insert(parent.right, data);
        }

        return parent;
    }

    private boolean containsNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        if (data < current.data) {
            return containsNodeRecursive(current.left, data);
        }
        else {
            return containsNodeRecursive(current.right, data);
        }
    }

    public void add(int data) {
        depthCounter = 0;
        root = insert(root, data);
        depthMax = Math.max(depthCounter, depthMax);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public void print() {
        TreeFormatter formatter = new TreeFormatter();
        System.out.println(formatter.topDown(root));
    }

    public static class Node {
        public Node left;
        public int data;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
