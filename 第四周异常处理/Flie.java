package 第四周异常处理;

import java.io.*;

public class Flie {
   public static void main(String[] args){
	try {
		FileInputStream fls = new FileInputStream("d:\\a.txt");
		int b;
		b = fls.read();
		while(b!=-1) {
			System.out.print(b);
			b = fls.read();
		}
		fls.close();
	}
	
	catch(FileNotFoundException e) {
		System.out.println("FileNotFoundException:"+e.getMessage());
	}
	catch(IOException e1) {
		System.out.println("IOException:"+e1.getMessage());
	}
}
}
