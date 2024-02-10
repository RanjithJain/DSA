package com.java.sample;

import java.io.*;

public class FileOperation implements Runnable {

    @Override
    public void run() {
        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("./output.txt");
            BufferedReader bf=new BufferedReader(input);
            String arraystr="";
            while( (arraystr = bf.readLine())!= null){
                System.out.println(arraystr);
            }

            // Closes the reader
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

        String data = "This is the data in the output file";
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("./output.txt");
            BufferedWriter bw=new BufferedWriter(output);
            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

    }

    public static void main(String[] args) {


        Thread tr=new Thread(new FileOperation());
        tr.start();



    }
}
