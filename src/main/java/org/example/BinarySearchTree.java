package org.example;

public class BinarySearchTree {

    Node root;

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.add(6);
        bt.add(8);
        bt.add(4);
        bt.add(7);
        bt.add(3);

//        System.out.println(bt.toString());
//        System.out.println("Inorder traversal");
//        bt.inorder(bt.root);
//
//        System.out.println("\nPreorder traversal ");
//        bt.preorder(bt.root);
//
//        System.out.println("\nPostorder traversal");
//        bt.postorder(bt.root);
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + "->");

        // Traverse left
        postorder(node.left);
        // Traverse right
        postorder(node.right);
        // Traverse root
    }

    void inorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + "->");
        // Traverse left
        inorder(node.left);
        // Traverse root
        // Traverse right
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.value + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value >= current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }
}
