package com.java.sample;

import java.util.ArrayList;

public class LevelOrderTraversal {

    TreeNode root;

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int item) {
            this.data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Level order traversal of binary tree is ");
                tree.printLevelOrder();

    }

    public int height(TreeNode root){
        if(root == null){
           return 0;
        }else{
            int lheight=height(root.left);
            int rheight=height(root.right);

            if(lheight>rheight){
                return lheight+1;
            }else{
                return rheight+1;
            }
        }
    }

    public void printCurrentLevel(TreeNode root,int height){
        if(root == null)
            return ;
        else if(height==1)
            System.out.println(root.data);
        else if(height>1){
            printCurrentLevel(root.left,height-1);
            printCurrentLevel(root.right,height-1);
        }
    }

    public void printLevelOrder(){
        int height=height(root);
        for(int i=1;i<=height;i++){
            printCurrentLevel(root,i);
        }


    }


}
