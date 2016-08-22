package io;

import java.io.*;

public class Text {
    public static void main(String[] args) throws IOException{
//        FileOutputStream fos = new FileOutputStream("/tmp/text1");
//        PrintStream ps = new PrintStream(fos);
//        ps.println("hello joker");
//        ps.close();
//
//        FileWriter fw = new FileWriter("/tmp/text2");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("llllllasdffffkljdlsjflksjdlfkjsldjflsjldkfjlsdf");
//        bw.close();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            line = br.readLine();
        }
    }
}
