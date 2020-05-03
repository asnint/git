package Nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

import javax.swing.Spring;

public class Server {
	public static HashSet<DataOutputStream> allSocket;
	public static ServerSocket server;

	public Server() {
		try {
			server = new ServerSocket(1234);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allSocket = new HashSet<DataOutputStream>();
	}

	public void startServer() throws IOException {
		while (true) {
			Socket socket = server.accept();
			System.out.println("用户进入聊天室");
			DataOutputStream send = new DataOutputStream(socket.getOutputStream());

			Server.allSocket.add(send);
			ServerThread t = new ServerThread(socket, send);
			t.start();
		}
	}

	public static void main(String[] args) {
		Server s = new Server();
		try {
			s.startServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ServerThread extends Thread {
	Socket socket;

	DataInputStream accept = null;
	DataOutputStream send = null;

	public ServerThread(Socket socket, DataOutputStream s) {
		this.socket = socket;
		this.send = s;

	}

	public void run() {

		try {
			String str = null;
			accept = new DataInputStream(socket.getInputStream());
			while (true) {
				if (accept.available() != 0) {
					str = accept.readUTF();
					if (str.contains("exit") || str.contains("EXIT")) {
						String name = str.split("[:]")[0];
						Server.allSocket.remove(send);
						if (Server.allSocket.size() != 0)
							sendMessageToAllClinet(name + "已退出聊天室！");

						return;
					}
					if (Server.allSocket.size() != 0)

						sendMessageToAllClinet(str);

				}

			}
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}

	void sendMessageToAllClinet(String str) {
		for (DataOutputStream send : Server.allSocket) {
			try {

				send.writeUTF(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}

		}
	}
}
