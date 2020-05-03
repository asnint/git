
import java.awt.*;
import java.awt.event.*;
import java.net.*;

import javax.swing.*;

public class Receive extends JFrame implements Runnable, ActionListener {
	int port; // ����int�ͱ������洢�˿ں�
	InetAddress group = null; // ����InetAddress����
	MulticastSocket socket = null; // �������㲥�׽��ֶ���
	JButton ince = new JButton("��ʼ����"); // "��ʼ����"��ť
	JButton stop = new JButton("ֹͣ����");// "ֹͣ����"��ť
	JTextArea inceAr = new JTextArea(10, 10); // ��ʾ���չ㲥����ʾ
	JTextArea inced = new JTextArea(10, 10);// ��ʾ���յ��Ĺ㲥
	Thread thread; // ����Thread���������¿��߳�ִ�й㲥���ղ���
	boolean b = false; // ����boolean�ͱ�������ʾ�Ƿ���չ㲥

	public Receive() { // ���췽��
		super("�㲥���ݱ�"); // ���ô������
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// ���ô���رշ�ʽ
		thread = new Thread(this);// ʵ�����̶߳���
		ince.addActionListener(this); // ��"��ʼ����"��ť�ĵ����¼�
		stop.addActionListener(this); // �� "ֹͣ����"��ť�ĵ����¼�
		inceAr.setForeground(Color.blue); // ָ����ʾ�ı�����������ɫ
		JPanel north = new JPanel(); // ����Jpane����
		north.add(ince); // ����ť��ӵ����north��
		north.add(stop);
		add(north, BorderLayout.NORTH); // ��north�����ڴ�����ϲ�
		JPanel center = new JPanel(); // ����������center
		center.setLayout(new GridLayout(1, 2)); // ������岼��
		center.add(inceAr); // ���ı�����ӵ������

		final JScrollPane scrollPane = new JScrollPane();
		center.add(scrollPane);
		scrollPane.setViewportView(inced);
		add(center, BorderLayout.CENTER); // ������岼��
		validate(); // ˢ��
		port = 9898; // ���ö˿ں�
		try {
			group = InetAddress.getByName("224.255.10.0"); // ָ�����յ�ַ
			socket = new MulticastSocket(port); // �󶨶��㲥�׽���
			socket.joinGroup(group); // ����㲥��
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
		setBounds(100, 50, 360, 380); // ���ò���
		setVisible(true); // ����������Ϊ��ʾ״̬
	}

	public void run() { // run()����
		while (true) {
			byte data[] = new byte[1024]; // ����byte���飬�����洢���յ�������
			DatagramPacket packet = null; // ����DatagramPacket����
			// �����յ����ݰ�
			packet = new DatagramPacket(data, data.length, group, port);
			try {
				socket.receive(packet); // �������ݰ�
				String message = new String(packet.getData(), 0, packet.getLength()); // ��ȡ���ݰ������ݣ�ת��Ϊ�ַ���
				// ������������ʾ���ı�����
				inceAr.setText("���ڽ��յ����ݣ�\n" + message);
				inced.append(message + "\n"); // ÿ����ϢΪһ��
			} catch (Exception e) {
				e.printStackTrace(); // ����쳣��Ϣ
			}
			if (b == true) { // ����������trueʱ���˳�ѭ��
				break;
			}
		}
	}

	public void actionPerformed(ActionEvent e) { // ��ť�ĵ����¼�
		if (e.getSource() == ince) { // �����"��ʼ����"��ť
			ince.setBackground(Color.red); // ���ð�ť��ɫ
			stop.setBackground(Color.yellow);
			if (!(thread.isAlive())) { // ���̲߳����ڡ��½�״̬��
				thread = new Thread(this); // ʵ����Thread����
			}
			thread.start(); // �����߳�
			b = false; // ���ñ���ֵΪfalse����ʾ��������
		}
		if (e.getSource() == stop) { // �����"ֹͣ����"��ť
			ince.setBackground(Color.yellow); // ���ð�ť��ɫ
			stop.setBackground(Color.red);
			b = true; // ���ñ���ֵΪtrue����ʾֹͣ��������
		}
	}

	public static void main(String[] args) { // ������
		Receive rec = new Receive(); // �����������
		rec.setSize(460, 200); // ���ô����С
	}
}
