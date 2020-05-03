package Nine;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class a extends JFrame {
	JPanel c;
	JLabel lbUserName;
	JTextField tfMessage;
	JButton btsend;
	JTextArea testArea;
	String username;
	Client client;

	public a(String ip, String username) {
		this.username = username;

		init();
		addListener();
		client = new Client(ip, 1234);
		RM t = new RM();
		t.start();

	}

	public class RM extends Thread {
		@Override
		public void run() {
			while (true) {
				String str = client.reciveMessage();
				if (str != null)
					testArea.append(str + "\n");
			}
		}
	}

	public void init() {
		setTitle("客户端");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		c = new JPanel();
		c.setBorder(new EmptyBorder(5, 5, 5, 5));
		c.setLayout(null);
		setContentPane(c);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 434, 229);
		scrollPane.setAutoscrolls(true);
		c.add(scrollPane);
		c.setAutoscrolls(true);

		testArea = new JTextArea();
		scrollPane.setViewportView(testArea);
		testArea.setEditable(false);

		JPanel panel = new JPanel();
		panel.setBounds(5, 235, 434, 32);
		c.add(panel);
		panel.setLayout(null);

		lbUserName = new JLabel(username);
		lbUserName.setHorizontalAlignment(SwingConstants.TRAILING);
		lbUserName.setBounds(2, 4, 55, 22);
		panel.add(lbUserName);

		tfMessage = new JTextField();
		tfMessage.setBounds(62, 5, 274, 22);
		tfMessage.setColumns(10);
		panel.add(tfMessage);

		btsend = new JButton("发送");
		btsend.setBounds(336, 4, 93, 23);
		panel.add(btsend);

		tfMessage.validate();
	}

	public void addListener() {
		tfMessage.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				// tfMessage.setText("");
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				int key = arg0.getExtendedKeyCode();
				String s = tfMessage.getText();
				if (key == '\n')
					if (s.length() != 0) {
						Date date = new Date();
						String mes = tfMessage.getText();
						SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

						client.sendMessage(username + ":  " + sf.format(date) + ":\n" + mes);
						if (mes.compareToIgnoreCase("exit") == 0) {
							System.exit(0);
							LinkServerFrame.v.dispose();
						}
						tfMessage.setText("");
					}

			}
		});
		btsend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				String mes = tfMessage.getText();
				SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

				client.sendMessage(username + ":" + sf.format(date) + ":\n" + mes);
				if (mes.compareToIgnoreCase("exit") == 0) {
					System.exit(0);
					LinkServerFrame.v.dispose();
				}
				tfMessage.setText("");
			}
		});
		this.addWindowFocusListener(new WindowAdapter() {
			public void windowClosing(WindowEvent atg0) {
				int op = JOptionPane.showConfirmDialog(a.this, "确定退出聊天室？", "确定", JOptionPane.YES_NO_CANCEL_OPTION);
				if (op == JOptionPane.YES_NO_CANCEL_OPTION) {
					client.sendMessage("%EXIT%:" + username);
					client.close();
					System.exit(0);
				}
			}
		});

	}

	public static void main(String[] args) {

		// a q = new a("127.0.0.1","1234");
		// q.setResizable(true);
		// q.setVisible(true);
	}
}
