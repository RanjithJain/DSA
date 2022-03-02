package com.java.sample;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ArrayResult {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        int []input=new int[arr.size()];

        for(int p=0;p<arr.size();p++){
            input[p]=arr.get(p);
        }
        Arrays.sort(input);
        int mindist = Integer.MAX_VALUE;
        Set<Integer> indexes = new HashSet<Integer>();
        int currdist;

        for(int i = 0; i < input.length-1; i++){
            currdist = input[i+1] - input[i];
            if(currdist < mindist){
                indexes = new HashSet<Integer>();
                indexes.add(i);
                mindist = currdist;
            }
            if(currdist == mindist){
                indexes.add(i);
            }
        }

        Iterator<Integer> it = indexes.iterator();
        int next;
        while(it.hasNext()){
            next = it.next();
            result.add(input[next]);
            result.add(input[next+1]);
        }

        Collections.sort(result);
        return result;

    }

}

public class ClosestInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ArrayResult.closestNumbers(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
