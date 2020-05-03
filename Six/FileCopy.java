package Six;

import java.io.*;
public class FileCopy {
      public static void main(String args[]) {
    	  FileInputStream in = null;
  		FileOutputStream out = null;
  		byte[] buf = new byte[1024];
  		int s=0;
  		try {   in=new FileInputStream("F:/0大学/1.txt");
  			    out=new FileOutputStream ("F:/0大学/2.txt");
  			  while ((s = in.read(buf)) != -1) {
  				out.write(buf, 0, s);
  			}

  		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
      }
      }}

//public class FileCopy {
//	public static void main(String[] args) {
//    File f1 = new File("a.txt");
//    File f2 = new File("xieru.txt");
//   FileReader fr = null;
//   FileWriter fw = null;
//   try {
//	fr = new FileReader(f1);
//  
//	char ch[] = new char[1000000];
//	int count,length=24;//读出字符数
//	try {
//		while((count=fr.read(ch))!=-1) length=count; 
//		//循环读取，直到最后 
//			String b= new String(ch,0,length);
//			System.out.println("文件中的内容为："+b);	
//	     fw = new FileWriter(f2);			
//		fw.write(b);	
//		
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
//} catch (FileNotFoundException e) {
//	
//	e.printStackTrace();
//}finally {
//	if(fr != null&&fw!=null) {
//		try {
//			fr.close();
//			fw.close();//必须要关闭，不然无结果
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
//   
//	
//}
//}
