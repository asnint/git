package Ten;

public	class Outer {
	    private int index;
	    public Outer(int index) {
	      this.index = index;
	    }
	    class Inner {
	      private int  index = 100;
	      public void print() {
	         System.out.println(this.index);
	         System.out.println(Outer.this.index);
	      }
	    }
	public static void main(String args[]) {
	            Outer out1 = new Outer(200);
	            Outer.Inner in = out1.new Inner();
	            in.print();
	}
}