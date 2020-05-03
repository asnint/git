package sy;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class Sortbj {

	public static void main(String[] args) {

		Thread s = new Thread(new mp());
		s.start();
		Thread s1 = new Thread(new cr());
		s1.start();
//		long s= crpx(a);
//		System.out.println(s);
//		long s2= mppx(a);
//		System.out.println(s2);
	}

}	

class mp implements Runnable {
	public void run() {
		int a[] = { 9, 5, 7, 6, 5, 4, 4, 7, 1, 10 };
		long st = System.nanoTime();
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					int t;
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		long et = System.nanoTime();
//    return et - st;
		System.out.println(et - st);
	}
}

class cr implements Runnable {
	public void run() {
		long st = System.nanoTime();
		// System.out.println(st);
		int a[] = { 9, 5, 7, 6, 5, 4, 4, 7, 1, 10 };
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			for (; j > 0 && a[j - 1] > temp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = temp;
		} // ÉýÐò
		long et = System.nanoTime();
		System.out.println(et - st);
	}
}
