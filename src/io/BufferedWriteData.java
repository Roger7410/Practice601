package io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedWriteData {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("/Users/JOKER/tmp/lala.data");
        BufferedOutputStream bos = new BufferedOutputStream(f);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeBytes("ni hao ma ");
        dos.close();
    }
}
