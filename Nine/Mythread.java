package Nine;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

 public class Mythread extends Thread{
	Socket client=null;
	public Mythread(Socket client){
		this.client=client;
	}
	public void run() {
		InputStream in = null;
		try {
			in = client.getInputStream();
			byte a[] = new byte[1024];
		int length = in.read(a);
		String me = new String(a,0,length);
		System.out.println("�ͷ��˷�����Ϣ��"+client.getInetAddress()+me);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			if(in!=null) {
//				try {
//					in.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}}
//			if(client!=null) {
//				try {
//					client.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}}
//		}
	}	
	}