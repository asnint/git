package sy;

import java.io.File;
import java.util.Scanner;

//定义一个类实现银行帐户的概念，包括的变量有"帐号"和""
//+ "存款余额"，包括的方法有"存款"、"取款"、"查询余额"、
//”显示帐号”以及存储功能。定义主类，创建帐户类的对象，
//并完成相应操作，要求能存储用户历史信息。
public class Accounts {
	 String account_number;
	 double leftmoney;
	 public Accounts(String account_number, int leftmoney) {
	    
	       this.account_number = account_number;
	       this.leftmoney = leftmoney;
	    }
	    public double getleftmoney() {   //查询余额
	    	return leftmoney;
	    }
	    public void savemoney(int money) {   //存款
	        leftmoney=leftmoney+money;
	    }
	 
	    public void getmoney(int money) {   //取款
	        if (leftmoney > money) {
	            leftmoney=leftmoney-money;
	        } 
	        else {
	            System.out.println("账户余额不足");
	        }
	    }
	    public void getAccounts() {//账号查询
	    	System.out.println("账号："+account_number);
	    }
	    public Accounts(int number,double money){   //构造方法
	    	File s = new File("w.txt");
	    	
	    }
	    public static void main(String[] args) {
	    	Accounts ba = new Accounts("123456", 500);
	        int s = 1000,g = 2000;
	    	ba.savemoney(s);
	    	
	        System.out.println("存入"+s+"元后，您的余额为："+ba.getleftmoney());
	        ba.getmoney(g);
	        System.out.println("取款"+g+"元后，您的余额为："+ba.getleftmoney());
	    }
}
