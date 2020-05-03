package sy;

import java.io.*;

public class Ch62 {
	public Ch62() {
		try {
			int a[] = new int[2];
			a[4] = 3;
			System.out.println("After handling exception return here?");
		} catch (IndexOutOfBoundsException e) {
			System.err.println("exception msg:" + e.getMessage());
			System.err.println("exception string:" + e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("-------------------");
			System.out.println("finally");
		}
		System.out.println("No exception?");
	}

	public static void main(String args[]) {
		new Ch62();
	}
}
