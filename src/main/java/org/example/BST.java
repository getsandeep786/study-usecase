//package com;
//
//public class BST {
//    com.boot.explore.main.Node root;
//    public static void main(String[] args) {
//        BST bst = new BST();
//        bst.add(10);
//        bst.add(12);
//        bst.add(8);
//        bst.add(13);
//        bst.add(9);
//        bst.add(2);
//    }
//
//    private void add(int val) {
//        root = addRecursive(root, val);
//    }
//
//    private Node addRecursive(Node current, int val) {
//        if(current == null){
//            current = new Node(val);
//        }
//        if(val<current.value){
//            current.left = addRecursive(current.left, val);
//        }
//        else if(val>current.value){
//            current.right = addRecursive(current.right, val);
//        }
//        return current;
//    }
//}
