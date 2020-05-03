package Nine;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LinkServerFrame extends JFrame {
	public static a v = null;
	private static final long serialVersionUID = 1L;
	JPanel c;
	JLabel LIP, LUserName;
	JTextField tfIP, tfUserName;
	JButton Btlink;

	public LinkServerFrame() {
		setTitle("连接服务器");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;
		setBounds(200, 200, 390, 150);

		c = new JPanel();
		c.setBorder(new EmptyBorder(5, 5, 5, 5));
		c.setLayout(null);
		setContentPane(c);

		LIP = new JLabel("服务器IP地址：");
		LIP.setBounds(20, 15, 100, 15);
		c.add(LIP);

		tfIP = new JTextField("127.0.0.1");
		tfIP.setBounds(121, 13, 242, 21);
		c.add(tfIP);
		tfIP.setColumns(10);

		LUserName = new JLabel("用户名：");
		LUserName.setBounds(60, 40, 60, 15);
		c.add(LUserName);

		tfUserName = new JTextField();
		tfUserName.setBounds(121, 42, 242, 21);
		c.add(tfUserName);
		tfUserName.setColumns(10);

		Btlink = new JButton("连接");
		Btlink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dos(e);
			}
		});

		Btlink.setBounds(140, 80, 120, 23);
		c.add(Btlink);

	}

	public static void main(String[] args) {
		LinkServerFrame linkServerFrame = new LinkServerFrame();
		linkServerFrame.setVisible(true);

	}

	public void dos(ActionEvent e) {
		if (!tfIP.getText().equals("") && !tfUserName.getText().equals("")) {
			dispose();
			LinkServerFrame.v = new a(tfIP.getText(), tfUserName.getText());
			LinkServerFrame.v.setVisible(true);

		} else {
			JOptionPane.showMessageDialog(null, "文本框的内容不能为空");
		}
	}
}