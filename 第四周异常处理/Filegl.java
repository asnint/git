package 第四周异常处理;

import java.io.*;
public class Filegl {
    public static void main(String[] args) {
		String dir = "d:\\新建文件夹";
		File currdir = new File(dir);
		String[] filter = currdir.list(new FileFilter());
		for(int i=0;i<filter.length;i++) {
			System.out.println(filter[i]);
		}
	}
}
