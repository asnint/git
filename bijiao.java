public class bijiao {
   public static void main(String args[]) {
	   duixiang q=new duixiang(5);
	   duixiang w=new duixiang(5);
	  System.out.println(q==w);
	  System.out.println(q.equals(w));
   }
}
class duixiang{
	int c;
	public duixiang(int c){
		this.c=c;
	}
public boolean equals(Object obj) {
	duixiang e=(duixiang)obj;
	if(this.c==e.c) return true;
	else return false;
}
}
