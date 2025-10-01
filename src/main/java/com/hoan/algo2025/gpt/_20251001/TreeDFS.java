package com.hoan.algo2025.gpt._20251001;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
    }
}

public class TreeDFS {
    // 전위 순회
    public static void preorder(Node node) {
        if(node == null) return;

        System.out.print(node.value+ " ");
        preorder(node.left);
        preorder(node.right);
    }
    //  중위 순회 - Inorder: Left → Root → Right
    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value+ " ");
        inorder(node.right);
    }
    // 후위 순회 - Postorder: Left → Right → Root
    public static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);


        root.left.left = new Node(4);
        root.left.right = new Node(5);

//        dfs(root);
        // inorder(root);
        postorder(root);
    }


}
