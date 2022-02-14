package com.java.sample;

import java.util.Arrays;
import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        System.out.println("args = " + myInt);
        //Write code here
        char [] alphabets={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int j=0;j<myInt;j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(alphabets[i]+" ");
            }
            System.out.println("");
        }

        }
    }
