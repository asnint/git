import java.lang.Math.*;
public class danziModel {
	private double a;
	private static danziModel b = new danziModel();
	private danziModel() {
		a = java.lang.Math.random();
	}
	private static danziModel huodeshili () {
		return b;
	}
	public double huodeshuzi() {
		return a;
	}

   public static void main(String[] args) {
	danziModel t1 = danziModel.huodeshili();
	danziModel t2 = danziModel.huodeshili();
	if (t1.huodeshuzi()==t2.huodeshuzi())System.out.println("ֻ������һ��ʵ��");
	else System.out.println("��δ������һ��ʵ��");
	
}
}
