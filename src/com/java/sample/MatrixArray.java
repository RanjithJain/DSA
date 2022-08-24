package com.java.sample;

import java.util.Arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int [][] mat={{1,2},{3,4}};
        int r=2;
        int c=4;
        int row=0,col=0;
        int resultArray[][]=new int [r][c];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j< mat[0].length;j++){
               resultArray[row][col]=mat[i][j];
               col++;
               if(col==c){
                   row++;
                   col=0;
               }

            }

        }
        for(int p=0;p< resultArray.length;p++){
            for(int q=0;q<resultArray[0].length;q++){
                System.out.print(resultArray[p][q]);
            }
        }
    }
}
