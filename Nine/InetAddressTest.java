package Nine;

import java.net.*;
public class InetAddressTest {//��ȡ������������IP
	public static void main(String[] args) {
		try {
			InetAddress ia  = InetAddress.getLocalHost();
			//InetAddress��һ����װ�õ��࣬ʹ����ֻ��Ҫ�����ñ����������ķ�������
			System.out.println(InetAddress.getLocalHost());
			System.out.println(InetAddress.getAllByName("www.baidu.com"));
			System.out.println("�ҵ��������ǣ�"+ia.getHostName()+
					"\n����IP��" +ia.getHostAddress());
			//Ϊ�˷�ֹ���ֽ������˵����������
			//�����Ҫ�׳��쳣
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

