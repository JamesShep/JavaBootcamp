package com.coderscampus.week5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("src/com/coderscampus/week5/data.txt"));
            System.out.println(fileReader.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Oops, the file wasn't found");
            e.printStackTrace();
        } finally {
            try {
                System.out.println("Closing the file reader");
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}