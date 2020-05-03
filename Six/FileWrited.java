package Six;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrited {
	public static void main(String[] args) {
	File f = new File("lalala.txt");
	FileOutputStream o = null;
	try {
		o = new FileOutputStream(f);//若参数中有true 则在文件末尾追加内容
		//默认false
		String str = "写入这个字符串进去lalala.txt文件中去";
		byte a[] = str.getBytes();//字符串转换为字节数组
		o.write(a);//将字节数组中数据写入到文件当中
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		if(o != null) {
			try {
				o.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}  //以上为字节流写法
		//字符流 写法  读出用byte装载
//		File f = new File("a.txt");
//	    FileWriter fw = null;
//	    try {
//			fw = new FileWriter(f);//此处依然可以加true
//			String str = "我是你可有可无的人";
//	        fw.write(str);//直接将字符串写入到文件当中
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(fw != null) {
//				try {
//					fw.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
	
//用char接收  一样用 new String 转换输出 
	    //加范围没有0    0 到count  Filereader系列会产生一个整形长度接受即可
	
	
}
}
