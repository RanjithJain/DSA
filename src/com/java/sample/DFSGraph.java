package com.java.sample;

import java.util.LinkedList;

public class DFSGraph {
    LinkedList<Integer> adhsList[];
    boolean vertices[];

    DFSGraph(int vert){

        LinkedList<Integer> adhsList[]=new LinkedList[vert];
        boolean vertices[]=new boolean[vert];

        for(int i=0;i<vert;i++){
            adhsList[i]=new LinkedList<Integer>();
        }

    }

    void add(int src,int dest){
        adhsList[src].add(dest);
    }

    void dfs(int vertex){
        vertices[vertex]=true;
        System.out.println(vertex+" ");



    }
    public static void main(String[] args) {

        DFSGraph dfsGraph=new DFSGraph(4);

        dfsGraph.add(0,1);
        dfsGraph.add(0,2);
        dfsGraph.add(0,3);
        dfsGraph.add(2,3);

        System.out.println("dfs from vertex 2");
        dfsGraph.dfs(2);
    }


}
