package Ten;

public class NMNBL {//匿名内部类
   public Out a() {
	   return  new Out() {
		 private int  a1 = 8;
		 public int getINT() {
			 return a1;
		 }
	   };
	   
   }
   public static void main(String[] args) {
	   NMNBL num = new NMNBL();
	   Out o =  num.a();
	  System.out.println(o.getINT());
	   
}
}
interface Out{
	int getINT();
}
