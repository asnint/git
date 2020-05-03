
public class book {
  String name = "abc";
    public void showName(String name) {
    	System.out.println(this.name);
    }
    public static void main(String[] args) {
		book b = new book();
		b.showName("123");
		
	}
}
