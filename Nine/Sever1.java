package Nine;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.HashSet;
import java.util.Scanner;

public class Sever1 {
	public static HashSet<Socket> serversocket = new HashSet<Socket>();

	// ��¼ÿ���������˺�
	// ����֮�����û��˳����û�����
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4564);
			int count = 0;
			System.out.println("�������Ѿ�������������\n ��ǰ�û�Ϊ��" + count);
			while (true) {
				Socket client = server.accept();
				serversocket.add(client);
				Mythread thread = new Mythread(client);
				thread.start();
			    
				System.out.println("��ǰ�û�Ϊ��" + count++);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
   
}