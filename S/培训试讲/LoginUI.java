package emm;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUI {
	public void ShowUI() {
		JFrame qq = new JFrame();
		qq.setTitle("��¼����");
		qq.setSize(500, 380);
		qq.setLocationRelativeTo(null);
		
		qq.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		qq.setResizable(false);
		FlowLayout flow = new FlowLayout();
		qq.setLayout(flow);
		
		ImageIcon image = new ImageIcon("C:\\Users\\asus\\Desktop\\aaa1.jpg");
		JLabel imglab = new JLabel(image);
		
		qq.add(imglab);
		//ͼƬ
		JLabel a = new JLabel("                �˺�:");
		qq.add(a);
		
		
		JTextField input = new JTextField();
		Dimension dms = new Dimension(300,25);
		input.setPreferredSize(dms);
		qq.add(input);
		
		
		JLabel a1 = new JLabel("ע���˺� ");
		qq.add(a1);
		
		JLabel a12 = new JLabel("                     ����:");
		qq.add(a12);
		
		JPasswordField psd = new JPasswordField();
		Dimension dms1 = new Dimension(300,25);
		psd.setPreferredSize(dms1);
		qq.add(psd);
		
		JLabel b1 = new JLabel("�һ�����      ");
		qq.add(b1);
		
		JLabel q = new JLabel("                                       ");
		qq.add(q);
		
		JCheckBox k1 = new JCheckBox();
		qq.add(k1);
		
	    JLabel k11 = new JLabel("��ס����                           ");
		qq.add(k11);
		
		
		JCheckBox k2 = new JCheckBox();
		qq.add(k2);	
		
		JLabel k12 = new JLabel("�Զ���½                         ");
		qq.add(k12);
		
		JLabel k21 = new JLabel("                ");
		qq.add(k21);
		
		JButton bb = new JButton("��½");
		qq.add(bb);
		
		Monitor logal = new Monitor();
		bb.addActionListener(logal);
		logal.Input = input;
		logal.psd = psd;
		logal.jf = qq;
		qq.setVisible(true);
		
		
	}
    public static void main(String[] args) {
		LoginUI a = new LoginUI();
		a.ShowUI();
	}
}
