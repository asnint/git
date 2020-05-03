package sy;

import java.io.*;

public class testRandom2 {
	public static void main(String args[]) {
		try {
			RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
			for (int i = 0; i < 10; i++) {
				rf.writeInt(i);
				rf.writeDouble(i * 1.414);
			}
			rf.close();
			rf = new RandomAccessFile("rtest.dat", "rw");
			rf.seek(5 * (4 + 8));
			rf.writeInt(47);
			rf.writeDouble(47.00021);
			rf.close();
			rf = new RandomAccessFile("rtest.dat", "r");
			for (int i = 0; i < 10; i++) {
				;
				System.out.println("Value " + rf.readInt() + ": " + rf.readDouble());
			}
			rf.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
