package emm;

public class Ó¢ÐÛ {
    public String name;
    public int gjl,blood;
    public void gj(Ó¢ÐÛ a) {
    	System.out.println(name+"ÕýÔÚ¹¥»÷"+a.name);
    	a.blood-=gjl;
    }
    public void sdsh(Ó¢ÐÛ a) {
    
    	System.out.println(name+"ÑªÁ¿Ê£Óà£º"+blood);
    }
   
    
    public static void main(String[] args) {
		Ó¢ÐÛ a = new Ó¢ÐÛ();
		Ó¢ÐÛ b = new Ó¢ÐÛ();
		a.name = "Àî°×";
		b.name = "Â¶Â¶";
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
			System.out.println(a.name+"±»´ò°ÜÁË");
			
		}else {
			System.out.println(b.name+"±»´ò°ÜÁË");
		}
	}
}

