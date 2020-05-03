package Seven;
import java.io.*;
import java.util.*;
public class test {
	public static void randwrite(String path) throws IOException {
		Date startDate;
		double usedate;
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		Random random = new Random();
		long position;
		byte mark[] = new byte[20];

		mark = new String("ALIN").getBytes();
		startDate = new Date();
		for (int i = 0; i < 100; i++) {
			// 8G文件共有8589934592字节
			position = 8589934592L - (random.nextInt(Integer.MAX_VALUE) * 2 + 14);
			file.seek(position);
			file.write(mark);
			file.writeInt(random.nextInt());
			// file.writeInt(65537);// 用于测试
		}
		file.close();
		usedate = (new Date().getTime() - startDate.getTime()) / 1000;

		System.out.println("Success！");
		System.out.println("Time's：" + usedate + "S");
	}

	public static void finddata(String path) throws IOException {
		int bufferSize = 1024 * 1024 * 10;
		Date startDate;
		double usedate;
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file), bufferSize);
		char temp[] = new char[1024];
		String markstr ="ALIN";
		long num[] = new long[100];
		int position = 0;

		System.out.println("Loading……");
		startDate = new Date();
		while (br.read(temp) != -1)
			for (int i = 0; i < 1010; i++) {
				if (temp[i] == 'A')
					if (markstr.compareTo(new String(temp, i, 4)) == 0) {
						i = i + 4;
						num[position] = (temp[i] << 16) | (temp[i + 1]);
						System.out.println(num[position++]);
						//System.out.println(num);
//						if (num > max)
//							max = num;
//						i++;
					}
			}
		br.close();
		Arrays.sort(num);
		for(int i=0;i< 100;i++) {
		System.out.println("第"+i+"大的数字"+num[i]);
		}
		System.out.println("第80大的数字"+num[81]);
		
		usedate = (new Date().getTime() - startDate.getTime()) / 1000;

//		System.out.println("最大值为：" + max);
		System.out.println("所用时间为：" + usedate + "S");
	}
	public static void main(String[] args) throws IOException {
		String path = "D:\\myfile.data";
		randwrite(path);
		finddata(path);
	}

}
//public class test {
//	static int i = 0, j = 0;
//	private static String a1;
//	public static void randwrite(String path) throws IOException {
//		Date startDate;
//		double usedate;
//		RandomAccessFile file = new RandomAccessFile(path, "rw");
//		Random random = new Random();
//		long position;
//		byte mark[] = new byte[20];
//
//		mark = new String("yuan").getBytes();
//		startDate = new Date();
//		for (int i = 0; i < 100; i++) {
//			// 8G文件共有8589934592字节
//			position = 8589934592L - (random.nextInt(Integer.MAX_VALUE) * 2 + 14);
//			file.seek(position);
//			file.write(mark);
//			file.writeInt(random.nextInt());
//			// file.writeInt(65537);// 用于测试
//		}
//		file.close();
//		usedate = (new Date().getTime() - startDate.getTime()) / 1000;
//
//		System.out.println("数据写入完成！");
//		System.out.println("所用时间为：" + usedate + "S");
//	}
//
//	public static void main(String args[]) {
////RandomAccessFile f = new RandomAccessFile("d://myfile.data", "rw");
////	for(i=0;i<100;i++) {
////    long a=(long) ((Math.random()*8589934892L)%8589934892L);
////    f.seek(a);
////    f.writeChars("yuan");;
////    int b=(int)((Math.random()*10000)%8000);
////    f.writeInt(b);}
//  try {  test.randwrite("d://myfile.data");
//    i=0; int d[]=new int[100];
//        a1 = "yuan";
//        char a2[]=new char[1024];
//           		int size=1024*1024*10;
//           		BufferedReader f1 = new BufferedReader(new FileReader("d://myfile.data"),size);
//           		System.out.println("deng");
//	while((f1.read(a2))!=-1){
//		for(i=0;i<1018;i++) {
//			if(a2[i]=='y')
//			{
//				if((a1.compareTo(new String(a2,i,4)))==0) {
//					d[j++]=((a2[i+4])<<16)|a2[i+5];
//		}
//				}
//			}
//		
//	}
//   f1.close();
//   for(i=0;i<100;i++) {
//	   if(i%10==0) System.out.println(" ");
//	   System.out.print(d[i]+" ");
//   }
//}catch(IOException e)
//	{
//		e.printStackTrace();
//	}
//}}