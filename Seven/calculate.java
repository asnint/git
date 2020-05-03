package Seven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculate extends JFrame {
	
	JButton[] b = new JButton[10];
	JPanel panel1 = new JPanel(); // 实例化面板
	JPanel panel2 = new JPanel(); //swing中的容器（面板），如同awt中的container一般
	JPanel panel3 = new JPanel();//1是用来装载显示区域和AC 
	                             //2时用来装载数字和小数点和等号
	                             //3时用来装载+-*/
	                            //为了方便布局，最好先在画图板草稿
    JTextField answer=new JTextField(10);
	JButton clear=new JButton("AC");
	JButton equal=new JButton("=");
	JButton point=new JButton(".");
	JButton plus=new JButton("+");
	JButton minus=new JButton("-");
	JButton multi=new JButton("×");
	JButton division=new JButton("÷");
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
public calculate(){//calculator继承JFrame 因此方法可以直接使用 
	setTitle("计算器");//设置窗体名
	//setSize(300,300);//设置窗体大小
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭规则
	                                               //点击关闭按钮一旦点击程序终止	
	//setLocation(557, 431);//设置显示的坐标，单位像素
	setBounds(557, 431, 300, 300);//一次性设置显示位置及窗口大小
//	Toolkit kit = Toolkit.getDefaultToolkit();
//	Dimension screenSize = kit.getScreenSize();//获	取屏幕分辨率
//	setLocation(screenSize.width/4,screenSize.height/4);//位置
	for ( i =9; i>=0; i--) {
		b[i] = new JButton(Integer.toString(i));//依次实例化数字按钮 
		b[i].addActionListener(new shuzi());//判断其中的方法
		panel2.add(b[i]); //将按钮一个一个的增加到面板
		
	}
	//answer.setText("输入数值");
	setLayout(new FlowLayout()); // 设置布局管理器 
	panel1.setLayout(new FlowLayout());//设置流布局
	panel2.setLayout(new GridLayout(4,3,10,8));//设置网格布局，4行3列，水平和垂直间距
	                                          //分别为10和8.panel3也是如此
	panel3.setLayout(new GridLayout(4,1,8,12)); 
	clear.setFont(new Font("楷体",Font.PLAIN,15));//更改字体，new一个font 
	                            //三个参数  字体  设置加粗倾斜(PLAIN为普通样式)字号
	clear.setForeground(Color.RED);//更改前景色，实义为更改 字体颜色
	clear.addActionListener(new MyListener1());//添加监听，当执行AC时，执行该方法
	equal.setForeground(Color.RED);
	equal.addActionListener(new MyListener1());//添加监听，当执行=时，执行该方法
	plus.setForeground(Color.RED);
	plus.addActionListener(new MyListener1());//添加监听，当执行+时，执行该方法
	minus.setForeground(Color.RED);
	minus.addActionListener(new MyListener1());//添加监听，当执行-时，执行该方法
	multi.setForeground(Color.RED);
	multi.addActionListener(new MyListener1());//添加监听，当执行*时，执行该方法
	division.setForeground(Color.RED);
	division.addActionListener(new shuzi());//添加监听，当执行/时，执行该方法
	/*
	 * 设置字体字号*/equal.setFont(new Font("楷体",Font.PLAIN,20));
	 
	plus.setFont(new Font("楷体",Font.PLAIN,18));
	minus.setFont(new Font("楷体",Font.PLAIN,18));
	multi.setFont(new Font("楷体",Font.PLAIN,18));
	division.setFont(new Font("楷体",Font.PLAIN,18));
	point.addActionListener(new MyListener1());//添加监听，当执行.时，执行该方法
	panel1.add(answer);//添加到面板中
	panel1.add(clear);
	panel2.add(point);
	panel2.add(equal);
	panel3.add(plus);
	panel3.add(minus);
	panel3.add(multi);
	panel3.add(division);
	add(panel1);//将面板添加到窗口中
	add(panel2);
	add(panel3);
}
class shuzi implements ActionListener{


	public void actionPerformed(ActionEvent a) {
		
		for(int i=0;i<=9;i++){//循环10次目的为了0-9数字
			if(a.getSource()==b[i]||a.getSource()==point){//如果是数字或者小数点
				answer.setText("");//显示面板变空
				if(a.getSource()==point){//小数点则加上一个点
					s=foreText+".";
					answer.setText(s);//文字框上显示
				}
				if(a.getSource()!="+"&&a.getSource()!="*"&&a.getSource()!="-"&&a.getSource()!="÷"){//如果不是空的，那么便是数字，将其存入字符串并显示
					answer.setText(s+b[i].getText());
					foreText=s+b[i].getText();//此处应当修改，
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
 class MyListener1 implements ActionListener{//因为是动作监听必须继承该接口
	public void actionPerformed(ActionEvent e){//e可以改名，但是actionPerformed为默认
	
		if(e.getSource()==clear){
			foreText="";
			s="";
			answer.setText("");
			//answer.requestFocus();鼠标光标回归  所谓焦点理解为光标即可
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