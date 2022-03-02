package com.java.sample;

public class BSTSearchElement {

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
        BSTSearchElement tree = new BSTSearchElement();
        tree.root = new TreeNode(6);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(7);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Level order traversal of binary tree is ");
        if((tree.search( tree.root,45))==null)
            System.out.println("Not Found");
        else
            System.out.println("key found");
    }
    public TreeNode search(TreeNode root,int item){

        if(root==null){
            return root;
        }
        else if (root.data==item) {
            return root;
        }else{
            while(root != null && root.data!=item){
                if(item>root.data){
                    return(search(root.right,item));
                }else{
                    return(search(root.left,item));
                }
            }
        }
    return root;
   }


}
