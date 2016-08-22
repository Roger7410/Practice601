package io;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/tmp/text1");
        DataInputStream dis = new DataInputStream(fis);
        String s = dis.readLine();
        dis.close();
        System.out.println(s);
    }
}
