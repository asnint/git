package Nine;

import java.net.*;
public class InetAddressTest {//获取本机主机名和IP
	public static void main(String[] args) {
		try {
			InetAddress ia  = InetAddress.getLocalHost();
			//InetAddress是一个封装好的类，使用者只需要用引用变量引用它的方法即可
			System.out.println(InetAddress.getLocalHost());
			System.out.println(InetAddress.getAllByName("www.baidu.com"));
			System.out.println("我的主机名是："+ia.getHostName()+
					"\n它的IP是" +ia.getHostAddress());
			//为了防止出现解析不了的主机的情况
			//因此需要抛出异常
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

