// OBS: Não escrevi o código para printar a Árvore Binária, encontrei no StackOverFlow e deixei o link no arquivo "TreeFormatter"

public class BinaryTree {

    private Node root;

    private Node insert(Node parent, int data) {
        if (parent == null) {
            return new Node(data);
        }

        if (data < parent.data) {
            parent.left = insert(parent.left, data);
        }
        else if (data > parent.data) {
            parent.right = insert(parent.right, data);
        }

        return parent;
    }

    private boolean containsNodeRecursive(Node parent, int data) {
        if (parent == null) {
            return false;
        }

        if (data == parent.data) {
            return true;
        }

        if (data < parent.data) {
            return containsNodeRecursive(parent.left, data);
        }
        else {
            return containsNodeRecursive(parent.right, data);
        }
    }

    public Node deleteRecursive(Node parent, int data) {

        if (parent == null)
            return parent;

        // Atravessa recursivamente a árvore até chegar no nó que deseja deletar
        if (data < parent.data) {
            parent.left = deleteRecursive(parent.left, data);
            return parent;
        }
        else if (data > parent.data) {
            parent.right = deleteRecursive(parent.right, data);
            return parent;
        }

        // Agora o nó parent é o nó que desejamos deletar
        // Confere se tem apenas um nó filho (esquerda ou direita)
        if (parent.right == null) {
            return parent.left;
        }
        else if (parent.left == null) {
            return parent.right;
        }

        // Agora o nó que desejamos deletar possui 2 nós filhos
        // Devemos encontrar o sucessor do nó que desejamos deletar
        else {
            // Loop para encontrar o sucessor (succ) percorrendo pela esquerda do nó que será deletado
            Node succParent = parent;
            Node succ = parent.left;
            
            while (succ.right != null) {
                succParent = succ;
                succ = succ.right;
            }

            // Se o pai do sucessor ainda for o nó que queríamos deletar
            // (descemos apenas um nó na árvore para encontrar o sucessor)
            // A esquerda do pai do sucessor será a esquerda do sucessor
            if (succParent != parent) {
                succParent.right = succ.left;
            }
            else {
                succParent.left = succ.left;
            }

            parent.data = succ.data;

            return parent;
        }
    }

    public void add(int data) {
        root = insert(root, data);
    }

    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);
    }

    public Node remove(int data) {
        root = deleteRecursive(root, data);
        return root;
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
