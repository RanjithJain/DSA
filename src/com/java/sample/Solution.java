package com.java.sample;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("result = " + solve("o...o.x..o"));
    }
    public static int  solve(String A) {

        char [] strArray=A.toCharArray();
        int distancex=-1,distanceo=-1;
        boolean xflag=false;
        int count=-1;
        for(int i=0;i<strArray.length;i++){
            if(strArray[i] == 'x'){
                distancex=i;
                xflag=true;
            }
            if(strArray[i] == 'o' ){
                distanceo=i;
                xflag=false;
            }
            if(!xflag && distanceo>distancex && distanceo>=0 &&  distancex>=0){
                if(count==-1){
                    count=distanceo-distancex;
                }else{
                    if(count>(distanceo-distancex))
                        count=distanceo-distancex;
                }

            }
            if(xflag && distanceo<distancex  && distanceo>=0 &&  distancex>=0){
                if(count==-1){
                    count=distancex-distanceo;
                }else{
                    if(count>(distancex-distanceo))
                        count=distancex-distanceo;
                }

            }
        }
    return count;
    }
}

