package com.hoan.algo2025.gpt._20251001;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
    }
}

public class TreeDFS {
    public static void dfs(Node node) {
        if(node == null) return;

        System.out.print(node.value+ " ");
        dfs(node.left);
        dfs(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);


        root.left.left = new Node(4);
        root.left.right = new Node(5);

        dfs(root);
    }


}
