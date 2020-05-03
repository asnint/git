package 第四周异常处理;

import java.io.InputStream;
import java.util.Scanner;

public class StringClass {
   public static void main(String[] args) {
   Scanner a = new Scanner(System.in);
   System.out.println("请输入数字或者字符以及其他类型"+"\n"+"当输入goodbye时便结束");
   String b = "goodbye";
  boolean c = true;
//while(!b.equals(a.hasNextLine())) {
while(c) {
	 if(a.hasNextInt())
	{
	int j = a.nextInt();
	System.out.println("int类型"+j);}
	else if(a.hasNextDouble()) {
		double i = a.nextDouble();
		System.out.println("double类型"+i);}
	
	else if(a.hasNextBoolean()) {
		Boolean d = a.nextBoolean();
		System.out.println("boolean类型"+d);
	}
	else if(a.hasNextFloat()) {
		float m = a.nextFloat();
		System.out.println("float类型"+m);
	}	else if(b.equals(a.nextLine())) {
		 System.out.println("结束输入");break;}
	else System.out.println("字符串类型"+a.nextLine());
	 
	//System.out.println();
//	 if(b.equals(a.hasNextLine())) {
	//	 System.out.println("结束输入");}
	 a = new Scanner(System.in);
  }
}
}
