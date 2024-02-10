package com.java.sample;

public class TraversalTree {

    TreeNode1 root;

    public static void main(String[] args) {

        TraversalTree traversalTree=new TraversalTree();
        traversalTree.root=new TreeNode1(10);
        traversalTree.root.left=new TreeNode1(5);
        traversalTree.root.right=new TreeNode1(15);

        traversalTree.preOrderTraversal(traversalTree.root);
        System.out.println("");
        traversalTree.traversePostOrder(traversalTree.root);
        System.out.println("");
        traversalTree.inOrderTraversal(traversalTree.root);
    }

    public void  inOrderTraversal(TreeNode1 root){

        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.item);
           inOrderTraversal(root.right);

        }

    }

    public void  preOrderTraversal(TreeNode1 root){
        if(root!=null){
            System.out.print( root.item);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }

    }

    public void traversePostOrder(TreeNode1 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print( node.item);

        }
    }

}

class TreeNode1{
    int item;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int data){
        item=data;

    }
}
