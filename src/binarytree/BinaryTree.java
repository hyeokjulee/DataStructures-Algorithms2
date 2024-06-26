package binarytree;

class Node {
    int data;
    Node left;
    Node right;
}

class Tree {
    public Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node makeNode(Node left, int data, Node right) {
        Node node = new Node();

        node.data = data;
        node.left = left;
        node.right = right;

        return node;
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            inorder(node.left);
            inorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            inorder(node.left);
            inorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Tree t = new Tree();

        Node n4 = t.makeNode(null, 4, null);
        Node n5 = t.makeNode(null, 5, null);
        Node n2 = t.makeNode(n4, 2, n5);
        Node n3 = t.makeNode(null, 3, null);
        Node n1 = t.makeNode(n2, 1, n3);

        t.setRoot(n1);

        t.inorder(t.getRoot());
        System.out.println();
        t.preorder(t.getRoot());
        System.out.println();
        t.postorder(t.getRoot());
    }
}