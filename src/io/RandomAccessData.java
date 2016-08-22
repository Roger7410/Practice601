package io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by JOKER on 3/21/15.
 */
public class RandomAccessData {
    public static void main(String[] args) throws IOException{
        RandomAccessFile f = new RandomAccessFile("/tmp/text1","rw");
        f.seek(5);
        f.writeBytes("aaaaaaa");
    }
}
