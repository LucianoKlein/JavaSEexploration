package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Solution {
	public static void main(String[] args) throws IOException {
		//1.创建源
		File file = new File("sourcing.txt");
		//2.创建流
		Reader reader = new FileReader(file);
		//3.读写操作
		char[] buffer = new char[1024];
		int len = reader.read(buffer);
		
		while (len > 0) {
			System.out.println(new String(buffer, 0, len));
			len = reader.read(buffer);
		}
		//4.关闭流
		reader.close();
		//what happened?
	}
}
