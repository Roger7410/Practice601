package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by JOKER on 2/17/15.
 */
public class WriteData {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/JOKER/tmp/laa.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(42);
        dos.writeDouble(Math.PI);
        dos.close();
    }
}
