package �������쳣����;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Time {
    public static void main(String[] args) {
		DateFormat tm = new SimpleDateFormat("yyyy-MM-dd");
		   	 long n = 0;
		     Calendar  c = Calendar.getInstance();
			 c.set(2008, 9  - 1, 15);
			 n = c.getTimeInMillis();
             Date t =new Date(n);
             System.out.println("2008-9-15�����ͱ�ʾΪ��"+n);
             System.out.println("��������date��ʾΪ��"+tm.format(t));	
		}
}
