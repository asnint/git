
public class Cook {
   String name;
   public Cook() {
	   name = "Jack Chen";
   }
   void cutPepper() {
	   System.out.println(name+"������");
   }
   void washVegetables() {
	   System.out.println(name+"ϴ�߲�");
   }
   void cooking(String dish) {
	   washVegetables();
	   cutPepper();
	   System.out.println(name+"��ʼ���"+dish);
   }

}
