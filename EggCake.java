
public class EggCake {
  int eggCount;
  public EggCake(int eggcount) {
	  this.eggCount = eggcount;
	  System.out.println("�����������"+this.eggCount+"������");
  }
  public EggCake() {
	 // int i =1;//�ڹ��췽��֮ǰ�����Գ�ʼ�������췽�������ǳ�ʼ��
	  this(1);//�����в����Ĺ��췽��
      int i =1;
  }
  
  public static void main(String[] args) {
	  EggCake e1 = new EggCake(5);
	  EggCake e2 = new EggCake();
}
}
