package com.company.Practice3HomeWork;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Zadanie2 {
    public static void main(String[] args) throws IOException {
        FileReader myFile = new FileReader("c:/Бакай.txt");
        BufferedReader buff = new BufferedReader(myFile);
        FileOutputStream fos = new FileOutputStream("c:/notes.txt");

        while (true) {
            String line = buff.readLine();
            StringBuffer str = new StringBuffer(line);
            str.reverse();
            line = str.toString();
            byte[] buffer = line.getBytes();
            fos.write(buffer, 0, buffer.length);
            if (line == null) break;
            System.out.println(str);

        }

        buff.close();
        myFile.close();
    }
}
