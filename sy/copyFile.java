package sy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {
	public static void copyFile1(String src, String dest) throws IOException {
		FileInputStream fi = new FileInputStream(src);
		File f = new File(dest);
		if(!f.exists()) {
			f.createNewFile();
		FileOutputStream fo = new FileOutputStream(f);
		int c;
		byte[] b = new byte[1024];
		while((c=fi.read(b))!=-1) {
			for(int i = 0;i<c;i++) {
				fo.write(b);
			}
		}
		fi.close();
		fo.close();
		}
	}

	public static void main(String[] args) {
		try {
			copyFile1("a.txt", "c.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}