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
		o = new FileOutputStream(f);//����������true �����ļ�ĩβ׷������
		//Ĭ��false
		String str = "д������ַ�����ȥlalala.txt�ļ���ȥ";
		byte a[] = str.getBytes();//�ַ���ת��Ϊ�ֽ�����
		o.write(a);//���ֽ�����������д�뵽�ļ�����
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
	}  //����Ϊ�ֽ���д��
		//�ַ��� д��  ������byteװ��
//		File f = new File("a.txt");
//	    FileWriter fw = null;
//	    try {
//			fw = new FileWriter(f);//�˴���Ȼ���Լ�true
//			String str = "��������п��޵���";
//	        fw.write(str);//ֱ�ӽ��ַ���д�뵽�ļ�����
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
	
//��char����  һ���� new String ת����� 
	    //�ӷ�Χû��0    0 ��count  Filereaderϵ�л����һ�����γ��Ƚ��ܼ���
	
	
}
}
