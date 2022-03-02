package com.java.sample;


import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        char[][] strArray = new char[grid.size()][grid.size()];
        int count = 0;
        String result="NO";
        for (int j = 0; j < grid.size(); j++) {
            for (int i = 0; i < grid.size(); i++) {
                strArray[i] [j]= grid.get(count).charAt(i);
            }
            count++;
        }
        for (int i = 0; i < grid.size(); i++) {
            Arrays.sort(strArray[i]);
        }

        for (int col = 0; col < grid.size() - 1; col++) {
            for (int row = 1; row < grid.size() - 1; row++) {
                int comparTo = Character.compare(strArray[row][col], strArray[row -1 ][col]);
                if (comparTo > 0) {
                    result= "YES";
                } else {
                    result= "NO";
                }

            }
        }
       return result;
    }

}

public class Solution_GridChallenege {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String result = Result.gridChallenge(grid);

                System.out.println("Result "+result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

    }
}

