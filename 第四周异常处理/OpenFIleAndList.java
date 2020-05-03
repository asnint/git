package 第四周异常处理;

import java.io.File;

public class OpenFIleAndList {
    public static void main(String[] args) {
		list(new File("D:\\2223"));
	}
    public static void list(File ml) {
    	if(!ml.exists()||!ml.isDirectory())return;
    	String files[] = ml.list();
    	for(int i=0;i<files.length;i++)
    	{
    		File file =new File(ml,files[i]); 
    		if(file.isFile()) {
    		System.out.println(ml+"\\"+file.getName()+"长度"+file.length());
    	}
    		else {
    			System.out.println(ml+"\\"+file.getName()+"子目录下："+"\\");
    			list(file);
    		}
    		}
    }
}
