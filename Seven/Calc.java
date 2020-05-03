package Seven;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Calc extends JFrame {
	JButton[] b = new JButton[10];
	JPanel panel1 = new JPanel(); // ʵ�������
	JPanel panel2 = new JPanel(); 
	JPanel panel3 = new JPanel();
	JTextField answer=new JTextField(10);
	JButton clear=new JButton("���");
	JButton equal=new JButton("=");
	JButton point=new JButton(".");
	JButton plus=new JButton("+");
	JButton minus=new JButton("-");
	JButton multi=new JButton("��");
	JButton division=new JButton("��");
	String foreText=new String("");
	String backText=new String("");
	String s=new String();
	String s1=new String();
	Object op=new String();
	Object o=new String();
	double d, dFore, dBack;
	int i=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    JFrame calculator =new Calc();
		calculator.setVisible(true);
    
	}
public void calculator(){
	setTitle("������");
	setSize(300,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();//��ȡ��Ļ�ֱ���
	setLocation(screenSize.width/4,screenSize.height/4);//λ��
	for ( i =9; i>=0; i--) {
		b[i] = new JButton(Integer.toString(i));// ʵ�������ְ�ť 
		b[i].addActionListener(new MyListener1());
		panel2.add(b[i]); // ���Ӱ�ť�����
		
	}
	
	setLayout(new FlowLayout()); // ���ò��ֹ����� 
	panel1.setLayout(new FlowLayout());
	panel2.setLayout(new GridLayout(4,3,10,8));
	panel3.setLayout(new GridLayout(4,1,8,12)); 
	clear.setFont(new Font("����",Font.PLAIN,15));
	clear.setForeground(Color.RED);
	clear.addActionListener(new MyListener1());
	equal.setForeground(Color.RED);
	equal.addActionListener(new MyListener1());
	plus.setForeground(Color.RED);
	plus.addActionListener(new MyListener1());
	minus.setForeground(Color.RED);
	minus.addActionListener(new MyListener1());
	multi.setForeground(Color.RED);
	multi.addActionListener(new MyListener1());
	division.setForeground(Color.RED);
	division.addActionListener(new MyListener1());
	equal.setFont(new Font("����",Font.PLAIN,20));
	plus.setFont(new Font("����",Font.PLAIN,18));
	minus.setFont(new Font("����",Font.PLAIN,18));
	multi.setFont(new Font("����",Font.PLAIN,18));
	division.setFont(new Font("����",Font.PLAIN,18));
	point.addActionListener(new MyListener1());
	panel1.add(answer);
	panel1.add(clear);
	panel2.add(point);
	panel2.add(equal);
	panel3.add(plus);
	panel3.add(minus);
	panel3.add(multi);
	panel3.add(division);
	add(panel1); 
	add(panel2);
	add(panel3);
}

 class MyListener1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
		for(int i=0;i<=9;i++) {
			if(e.getSource()==b[i]||e.getSource()==point){
				answer.setText("");
				if(e.getSource()==point){
					
					s=foreText+".";
					answer.setText(s);
				}else{
				if(s!=""){
					answer.setText(s+b[i].getText());
					foreText=s+b[i].getText();//�˴�Ӧ���޸ģ�
				}else{
					answer.setText(foreText+b[i].getText());
				foreText=foreText+b[i].getText();
				}
				}
				}
		}
		if(e.getSource()==clear){
			foreText="";
			s="";
			answer.setText("");
		}
		if(e.getSource()==plus||e.getSource()==minus||e.getSource()==multi||e.getSource()==division){
			dFore=Double.parseDouble(foreText);
			s="";
			foreText="";
			answer.setText("");
			op=e.getSource();
		}
		if(e.getSource()==equal){
			dBack=Double.parseDouble(foreText);
			foreText="";
			answer.setText("");
			if(op==plus){
				d=dFore+dBack;
			}
			if(op==minus){
				d=dFore-dBack;
			}
			if(op==multi){
				d=dFore*dBack;
			}
			if(op==division){
				d=dFore/dBack;
			}
			answer.setText(""+d);
		}
	}
}
}