package com.java.sample;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalQueue {

    TreeNode root;

    public void print(TreeNode node) {

        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(node);
        while (!que.isEmpty()) {
            TreeNode tempNode = que.poll();
            System.out.println(tempNode.data);

            if (tempNode.left != null) {
                que.add(tempNode.left);
            }
            if (tempNode.right != null) {
                que.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {

        LevelOrderTraversalQueue tree = new LevelOrderTraversalQueue();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.println("Level order traversal of binary tree is ");
        tree.print(tree.root);

    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int item) {
        this.data = item;
        left = right = null;
    }
}
