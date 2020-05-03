public class lunzi{
	public lunzi() {
 System.out.println("我是轮子");}
	public static void main(String args[]) {
		hdqiche hdqc=new hdqiche();
}}
class shafa{
	public shafa() {
 System.out.println("我是沙发");}
}
class qiche{
	lunzi lz=new lunzi();
	shafa sf=new shafa();
	public qiche(){System.out.println("我是汽车");}
}
class fadongji{
	public fadongji() {
  System.out.println("我是发动机");}
}
class hdqiche extends qiche{
    fadongji fdj=new fadongji();
     public hdqiche() {System.out.println("我是混动汽车");}
}