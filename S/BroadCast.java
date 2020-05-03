
import java.net.*;

public class BroadCast extends Thread { // �����ࡣ����Ϊ���߳�ִ�г���
	String broadcast = "��ĿԤ�����˵��д�����ᣬ������";
	int port = 9898; // ����˿ڣ�ͨ���ö˿ڽ������ݵķ��ͺͽ���
	InetAddress iaddress = null; // ����InetAddress��������ָ���������ڶಥ��
	MulticastSocket socket = null; // �������㲥�׽���

	BroadCast() { // ���췽��
		try {
			// ʵ����InetAddress��ָ���������ڵ��飬��ķ�ΧΪ��224.0.0.0~224.255.255.255
			iaddress = InetAddress.getByName("224.255.10.0");
			socket = new MulticastSocket(port); // ʵ�������㲥�׽���
			socket.setTimeToLive(1); // ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iaddress); // ����㲥��
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}

	public void run() { // run()����
		while (true) {
			DatagramPacket packet = null; // ����DatagramPacket������ΪҪ���͵����ݰ�
			byte data[] = broadcast.getBytes(); // �����ֽ����飬�洢Ҫ���͵�����
			// ����Ҫ���͵����ݰ�
			packet = new DatagramPacket(data, data.length, iaddress, port);
			System.out.println(new String(data)); // ���㲥��Ϣ���
			try {
				socket.send(packet); // ��������
				sleep(3000); // �߳�����
			} catch (Exception e) {
				e.printStackTrace(); // ����쳣��Ϣ
			}
		}
	}

	public static void main(String[] args) { // ������
		BroadCast bCast = new BroadCast(); // �����������
		bCast.start(); // �����߳�
	}
}
