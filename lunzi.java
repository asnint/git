public class lunzi{
	public lunzi() {
 System.out.println("��������");}
	public static void main(String args[]) {
		hdqiche hdqc=new hdqiche();
}}
class shafa{
	public shafa() {
 System.out.println("����ɳ��");}
}
class qiche{
	lunzi lz=new lunzi();
	shafa sf=new shafa();
	public qiche(){System.out.println("��������");}
}
class fadongji{
	public fadongji() {
  System.out.println("���Ƿ�����");}
}
class hdqiche extends qiche{
    fadongji fdj=new fadongji();
     public hdqiche() {System.out.println("���ǻ춯����");}
}