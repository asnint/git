package Eight;

public class SynchornizedTest implements Runnable {
	int num = 10; // 设置当前总票数

	public void run() {
		while (true) {// 设置无限循环
			synchronized (this) {// 设置同步代码块
				if (num > 0) {// 判断当前票数是否大于0
					try {
						Thread.sleep(1000);// 使当前线程休眠100毫秒
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"----票数" +num--);// 票数减1
				}
			}
		}
	}

	public static void main(String[] args) {
		SynchornizedTest t = new SynchornizedTest();// 实例化类对象
		Thread tA = new Thread(t,"线程一");// 以该类对象分别实例化4个线程
		Thread tB = new Thread(t,"线程二");
		Thread tC = new Thread(t,"线程三");
		Thread tD = new Thread(t,"线程四");
		tA.start();// 分别启动线程
		tB.start();
		tC.start();
		tD.start();
	}
}
