
public class Cook {
   String name;
   public Cook() {
	   name = "Jack Chen";
   }
   void cutPepper() {
	   System.out.println(name+"ÇÐÀ±½·");
   }
   void washVegetables() {
	   System.out.println(name+"Ï´Êß²Ë");
   }
   void cooking(String dish) {
	   washVegetables();
	   cutPepper();
	   System.out.println(name+"¿ªÊ¼Åëâ¿"+dish);
   }

}
