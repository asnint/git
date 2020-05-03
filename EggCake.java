
public class EggCake {
  int eggCount;
  public EggCake(int eggcount) {
	  this.eggCount = eggcount;
	  System.out.println("鸡蛋灌饼里有"+this.eggCount+"个鸡蛋");
  }
  public EggCake() {
	 // int i =1;//在构造方法之前不可以初始化，构造方法本就是初始化
	  this(1);//调用有参数的构造方法
      int i =1;
  }
  
  public static void main(String[] args) {
	  EggCake e1 = new EggCake(5);
	  EggCake e2 = new EggCake();
}
}
