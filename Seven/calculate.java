package Seven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculate extends JFrame {
	
	JButton[] b = new JButton[10];
	JPanel panel1 = new JPanel(); // ʵ�������
	JPanel panel2 = new JPanel(); //swing�е���������壩����ͬawt�е�containerһ��
	JPanel panel3 = new JPanel();//1������װ����ʾ�����AC 
	                             //2ʱ����װ�����ֺ�С����͵Ⱥ�
	                             //3ʱ����װ��+-*/
	                            //Ϊ�˷��㲼�֣�������ڻ�ͼ��ݸ�
    JTextField answer=new JTextField(10);
	JButton clear=new JButton("AC");
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
		JFrame calculator =new calculate();
		calculator.setVisible(true);
    
	}
public calculate(){//calculator�̳�JFrame ��˷�������ֱ��ʹ�� 
	setTitle("������");//���ô�����
	//setSize(300,300);//���ô����С
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرչ���
	                                               //����رհ�ťһ�����������ֹ	
	//setLocation(557, 431);//������ʾ�����꣬��λ����
	setBounds(557, 431, 300, 300);//һ����������ʾλ�ü����ڴ�С
//	Toolkit kit = Toolkit.getDefaultToolkit();
//	Dimension screenSize = kit.getScreenSize();//��	ȡ��Ļ�ֱ���
//	setLocation(screenSize.width/4,screenSize.height/4);//λ��
	for ( i =9; i>=0; i--) {
		b[i] = new JButton(Integer.toString(i));//����ʵ�������ְ�ť 
		b[i].addActionListener(new shuzi());//�ж����еķ���
		panel2.add(b[i]); //����ťһ��һ�������ӵ����
		
	}
	//answer.setText("������ֵ");
	setLayout(new FlowLayout()); // ���ò��ֹ����� 
	panel1.setLayout(new FlowLayout());//����������
	panel2.setLayout(new GridLayout(4,3,10,8));//�������񲼾֣�4��3�У�ˮƽ�ʹ�ֱ���
	                                          //�ֱ�Ϊ10��8.panel3Ҳ�����
	panel3.setLayout(new GridLayout(4,1,8,12)); 
	clear.setFont(new Font("����",Font.PLAIN,15));//�������壬newһ��font 
	                            //��������  ����  ���üӴ���б(PLAINΪ��ͨ��ʽ)�ֺ�
	clear.setForeground(Color.RED);//����ǰ��ɫ��ʵ��Ϊ���� ������ɫ
	clear.addActionListener(new MyListener1());//��Ӽ�������ִ��ACʱ��ִ�и÷���
	equal.setForeground(Color.RED);
	equal.addActionListener(new MyListener1());//��Ӽ�������ִ��=ʱ��ִ�и÷���
	plus.setForeground(Color.RED);
	plus.addActionListener(new MyListener1());//��Ӽ�������ִ��+ʱ��ִ�и÷���
	minus.setForeground(Color.RED);
	minus.addActionListener(new MyListener1());//��Ӽ�������ִ��-ʱ��ִ�и÷���
	multi.setForeground(Color.RED);
	multi.addActionListener(new MyListener1());//��Ӽ�������ִ��*ʱ��ִ�и÷���
	division.setForeground(Color.RED);
	division.addActionListener(new shuzi());//��Ӽ�������ִ��/ʱ��ִ�и÷���
	/*
	 * ���������ֺ�*/equal.setFont(new Font("����",Font.PLAIN,20));
	 
	plus.setFont(new Font("����",Font.PLAIN,18));
	minus.setFont(new Font("����",Font.PLAIN,18));
	multi.setFont(new Font("����",Font.PLAIN,18));
	division.setFont(new Font("����",Font.PLAIN,18));
	point.addActionListener(new MyListener1());//��Ӽ�������ִ��.ʱ��ִ�и÷���
	panel1.add(answer);//��ӵ������
	panel1.add(clear);
	panel2.add(point);
	panel2.add(equal);
	panel3.add(plus);
	panel3.add(minus);
	panel3.add(multi);
	panel3.add(division);
	add(panel1);//�������ӵ�������
	add(panel2);
	add(panel3);
}
class shuzi implements ActionListener{


	public void actionPerformed(ActionEvent a) {
		
		for(int i=0;i<=9;i++){//ѭ��10��Ŀ��Ϊ��0-9����
			if(a.getSource()==b[i]||a.getSource()==point){//��������ֻ���С����
				answer.setText("");//��ʾ�����
				if(a.getSource()==point){//С���������һ����
					s=foreText+".";
					answer.setText(s);//���ֿ�����ʾ
				}
				if(a.getSource()!="+"&&a.getSource()!="*"&&a.getSource()!="-"&&a.getSource()!="��"){//������ǿյģ���ô�������֣���������ַ�������ʾ
					answer.setText(s+b[i].getText());
					foreText=s+b[i].getText();//�˴�Ӧ���޸ģ�
					answer.setText(foreText);
//				}else{
//					answer.setText(foreText+b[i].getText());
//				foreText=foreText+b[i].getText();
//				//answer.setText(foreText);
				}
				
				}
		}	
	}
	
}
 class MyListener1 implements ActionListener{//��Ϊ�Ƕ�����������̳иýӿ�
	public void actionPerformed(ActionEvent e){//e���Ը���������actionPerformedΪĬ��
	
		if(e.getSource()==clear){
			foreText="";
			s="";
			answer.setText("");
			//answer.requestFocus();�����ع�  ��ν�������Ϊ��꼴��
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