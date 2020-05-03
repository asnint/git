package 第四周异常处理;

import java.io.*;
//import java.io.FileNotFoundException;

public class FinallySortCatch {
   public static void main(String[] args) {
	try{FileInputStream in = new FileInputStream("d:/123.txt");
	int b;
	b = in.read();
	while (b!=-1) {
		System.out.print((char)b);
		b = in.read();
	}
	
	} catch (FileNotFoundException e) {
		System.err.println("没有找到文件");
		return;
	} catch (IOException e) {
		return;
	}finally {
		System.err.println("finally");
		
	}
}
}
