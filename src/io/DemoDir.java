package io;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DemoDir{
	public static void main(String[] args) throws IOException{
		String fileName = "src";
		File f = new File(fileName);
		String fileList[] = f.list();
		System.out.println(Arrays.toString(fileList));
}
}
