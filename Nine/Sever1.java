package Nine;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.HashSet;
import java.util.Scanner;

public class Sever1 {
	public static HashSet<Socket> serversocket = new HashSet<Socket>();

	// 记录每个主机的账号
	// 方便之后处理用户退出和用户加入
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4564);
			int count = 0;
			System.out.println("服务器已经启动。。。。\n 当前用户为：" + count);
			while (true) {
				Socket client = server.accept();
				serversocket.add(client);
				Mythread thread = new Mythread(client);
				thread.start();
			    
				System.out.println("当前用户为：" + count++);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
   
}