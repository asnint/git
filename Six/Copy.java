package Six;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String args[]) {
		FileInputStream in = null;
		FileOutputStream out = null;
		byte[] buf = new byte[1024];
		int s = 0;
		try {
			in = new FileInputStream("lalala.txt");
			out = new FileOutputStream("hahaha.txt");
			while ((s = in.read(buf)) != -1) {
				out.write(buf, 0, s);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
