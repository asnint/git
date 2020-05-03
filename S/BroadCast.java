
import java.net.*;

public class BroadCast extends Thread { // 创建类。该类为多线程执行程序
	String broadcast = "节目预报：八点有大型晚会，请收听";
	int port = 9898; // 定义端口，通过该端口进行数据的发送和接收
	InetAddress iaddress = null; // 创建InetAddress对象，用来指定主机所在多播组
	MulticastSocket socket = null; // 声明多点广播套接字

	BroadCast() { // 构造方法
		try {
			// 实例化InetAddress，指定主机所在的组，组的范围为：224.0.0.0~224.255.255.255
			iaddress = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port); // 实例化多点广播套接字
			socket.setTimeToLive(1); // 指定发送范围是本地网络
			socket.joinGroup(iaddress); // 加入广播组
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

	public void run() { // run()方法
		while (true) {
			DatagramPacket packet = null; // 声明DatagramPacket对象，作为要发送的数据包
			byte data[] = broadcast.getBytes(); // 声明字节数组，存储要发送的内容
			// 生成要发送的数据包
			packet = new DatagramPacket(data, data.length, iaddress, port);
			System.out.println(new String(data)); // 将广播信息输出
			try {
				socket.send(packet); // 发送数据
				sleep(3000); // 线程休眠
			} catch (Exception e) {
				e.printStackTrace(); // 输出异常信息
			}
		}
	}

	public static void main(String[] args) { // 主方法
		BroadCast bCast = new BroadCast(); // 创建本类对象
		bCast.start(); // 启动线程
	}
}
