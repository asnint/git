package sy;

import java.io.File;
import java.util.Scanner;

//����һ����ʵ�������ʻ��ĸ�������ı�����"�ʺ�"��""
//+ "������"�������ķ�����"���"��"ȡ��"��"��ѯ���"��
//����ʾ�ʺš��Լ��洢���ܡ��������࣬�����ʻ���Ķ���
//�������Ӧ������Ҫ���ܴ洢�û���ʷ��Ϣ��
public class Accounts {
	 String account_number;
	 double leftmoney;
	 public Accounts(String account_number, int leftmoney) {
	    
	       this.account_number = account_number;
	       this.leftmoney = leftmoney;
	    }
	    public double getleftmoney() {   //��ѯ���
	    	return leftmoney;
	    }
	    public void savemoney(int money) {   //���
	        leftmoney=leftmoney+money;
	    }
	 
	    public void getmoney(int money) {   //ȡ��
	        if (leftmoney > money) {
	            leftmoney=leftmoney-money;
	        } 
	        else {
	            System.out.println("�˻�����");
	        }
	    }
	    public void getAccounts() {//�˺Ų�ѯ
	    	System.out.println("�˺ţ�"+account_number);
	    }
	    public Accounts(int number,double money){   //���췽��
	    	File s = new File("w.txt");
	    	
	    }
	    public static void main(String[] args) {
	    	Accounts ba = new Accounts("123456", 500);
	        int s = 1000,g = 2000;
	    	ba.savemoney(s);
	    	
	        System.out.println("����"+s+"Ԫ���������Ϊ��"+ba.getleftmoney());
	        ba.getmoney(g);
	        System.out.println("ȡ��"+g+"Ԫ���������Ϊ��"+ba.getleftmoney());
	    }
}
