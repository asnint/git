package emm;

public class Ӣ�� {
    public String name;
    public int gjl,blood;
    public void gj(Ӣ�� a) {
    	System.out.println(name+"���ڹ���"+a.name);
    	a.blood-=gjl;
    }
    public void sdsh(Ӣ�� a) {
    
    	System.out.println(name+"Ѫ��ʣ�ࣺ"+blood);
    }
   
    
    public static void main(String[] args) {
		Ӣ�� a = new Ӣ��();
		Ӣ�� b = new Ӣ��();
		a.name = "���";
		b.name = "¶¶";
		a.blood = 100;
		b.blood = 100;
		a.gjl = 5;
		b.gjl = 8;
		while(a.blood>0&&b.blood>0) {
			a.gj(b);
			b.sdsh(b);
			if(b.blood<=0)break;
			else {b.gj(a);
			if(a.blood<=0)break;
			a.sdsh(a);}
			
		}
		if(a.blood<=0) {
			System.out.println(a.name+"�������");
			
		}else {
			System.out.println(b.name+"�������");
		}
	}
}

