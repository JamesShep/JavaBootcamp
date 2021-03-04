package com.coderscampus.lesson1;

import java.io.*;

public class FileServiceImpl implements FileService, GenericService {


    @Override
    public String readLine(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return reader.readLine();
        }
    }

    @Override
    public void writeLine(File file, String Line) throws IOException {

    }

    @Override
    public void logStuff() {

    }
}
