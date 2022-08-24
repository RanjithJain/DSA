package com.java.sample;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingle {
    public static void main(String[] args) {
        int numRows=5;

        {
            if(numRows==0)
            {
                //return new ArrayList<>();
            }
            List<List> res = new ArrayList<>();

            for(int i=1;i<=numRows;i++)
            {
                ArrayList<Integer> row = new ArrayList<>();
                for(int j=0;j<i;j++)
                {
                    if(j==0 || j==i-1) //first and last element of every row is always 1
                    {
                        row.add(1);
                    }
                    else
                    {
                        // adding jth and j-1th element of previous row
                        int num = (Integer)res.get(i-2).get(j) + (Integer)res.get(i-2).get(j-1);
                        row.add(num);
                    }
                }
                res.add(row);
            }
            //return res;
            res.forEach(r -> System.out.println(r));
        }

    }
}
