package Ten;

public class LocalInnerClass {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		MyInner in = out.f1();
		in.print();
	}
}
class Outer1 {
	private int index = 100;
	public MyInner f1() {
		final int b1 = 200;
		int b2 = 300;
		class Inner implements MyInner {
		   int a = 300;
		   public void print() {
		     System.out.println(index);
           System.out.println(a + "----" + b1);
         }
      }
      return new Inner();
  }
}

interface MyInner {
	void print();
}
