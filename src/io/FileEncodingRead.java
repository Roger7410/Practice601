package io;

import java.io.*;

/**
 * Created by JOKER on 2/17/15.
 */
public class FileEncodingRead {
    public static void main(String[] args) throws IOException{
        String encoding = "UNICODE";
        String fileName = "/tmp/text1";
        FileInputStream fis = new FileInputStream(fileName);
        Reader r = new InputStreamReader(fis,encoding);
        BufferedReader br = new BufferedReader(r);
        String result = xxx(br);
        System.out.println(result);
        br.close();
    }
    public static String xxx(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while( line!=null ){
            sb.append(line);
            line = br.readLine();
        }
        return sb.toString();
    }
}
