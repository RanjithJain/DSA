package com.java.sample;

import java.util.ArrayList;
import java.util.List;

public class MaxDepth {

    public static void main(String[] args) {
        int countleft=0;
        int countright=0;
        TreeNode root=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left=new TreeNode(10);
        System.out.println("maximum depth --  "+maxDepth(root));
        levelOrder(root);
    }

    public static int maxDepth(TreeNode root) {

        if(root ==null){
            return 0;
        }else{
            return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
        }

    }
    public static  List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>>al=new ArrayList<>();
        pre(root,0,al);
        return al;
    }
    public static void pre(TreeNode root,int l,List<List<Integer>>al)
    {
        if(root==null)
            return;
        if(al.size()==l)
        {
            List<Integer>li=new ArrayList<>();
            li.add(root.data);
            al.add(li);
        }
        else
            al.get(l).add(root.data);
        pre(root.left,l+1,al);
        pre(root.right,l+1,al);
    }


        public int[] reset() {

        int[] nums={1,2,3};
        return nums;
        }

        public int[] shuffle() {
            int[] nums={1,2,3};
            return nums;
        }




}
