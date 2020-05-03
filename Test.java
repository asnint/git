
public class Test {
   @Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
	System.out.println("调用finalize方法");
}
}

