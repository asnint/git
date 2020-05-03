package Eight;

public class CreateASimpleThread {
	public static void main(String[] args) {
	h a=new h();
	a.start();
	}
}
class  h extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("етЪЧ"+i);
		}
	}
}