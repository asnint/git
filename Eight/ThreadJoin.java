package Eight;

public class ThreadJoin extends Thread{
    private static int[] arr = new int [20];
    public void run() {
    	for(int i = 0;i<20;i++) {
    		System.out.println("初始化数组：arr["+i+"]="+(i+50));
    		arr[i]= i+50;
    	}
    }
    public static void main(String[] args) {
		ThreadJoin thread = new ThreadJoin();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<20;i++) {
			System.out.println("打印数组内容：arr["+i+"]"+arr[i]);
		}
	}
}
