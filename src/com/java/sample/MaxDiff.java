package com.java.sample;

public class MaxDiff {

    public static void main(String[] args) {
        int [] a={9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int maxdiff=-1;
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=0;--j){
                if((a[j]>a[i]) && maxdiff<(j-i) ){
                    maxdiff=j-i;
                    System.out.println("J value"+j+" I value "+i);
                }
            }
        }
        System.out.println(maxdiff);
    }
}
