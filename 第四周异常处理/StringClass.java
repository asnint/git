package �������쳣����;

import java.io.InputStream;
import java.util.Scanner;

public class StringClass {
   public static void main(String[] args) {
   Scanner a = new Scanner(System.in);
   System.out.println("���������ֻ����ַ��Լ���������"+"\n"+"������goodbyeʱ�����");
   String b = "goodbye";
  boolean c = true;
//while(!b.equals(a.hasNextLine())) {
while(c) {
	 if(a.hasNextInt())
	{
	int j = a.nextInt();
	System.out.println("int����"+j);}
	else if(a.hasNextDouble()) {
		double i = a.nextDouble();
		System.out.println("double����"+i);}
	
	else if(a.hasNextBoolean()) {
		Boolean d = a.nextBoolean();
		System.out.println("boolean����"+d);
	}
	else if(a.hasNextFloat()) {
		float m = a.nextFloat();
		System.out.println("float����"+m);
	}	else if(b.equals(a.nextLine())) {
		 System.out.println("��������");break;}
	else System.out.println("�ַ�������"+a.nextLine());
	 
	//System.out.println();
//	 if(b.equals(a.hasNextLine())) {
	//	 System.out.println("��������");}
	 a = new Scanner(System.in);
  }
}
}
