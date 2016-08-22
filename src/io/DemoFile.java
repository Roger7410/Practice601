package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        //String filename = args[0];
        String filename = "ab";
        File f = new File(filename);
        System.out.println("File is: "+filename+" "+f.length()+" bytes long~");
        System.out.println(f.getCanonicalPath());
//        FileWriter fw = new FileWriter(f);
//        fw.write("this is a test");
//        fw.close();
    }
}
