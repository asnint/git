package �������쳣����;

public class UsePrintStackTrace {
   public static void main(String[] args) {
	try {
		int a = 2,b = 0;
		int c = a / b;
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
