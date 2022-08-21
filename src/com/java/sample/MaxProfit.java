package com.java.sample;

public class MaxProfit {

    public static void main(String[] args) {

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        int[] prices = {2, 4, 1};

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        System.out.println(op);
    }
}
