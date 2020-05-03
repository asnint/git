package 第四周异常处理;

import java.io.*;
import java.sql.SQLException;

public class Father0IfSonRun {
    public void action() throws IndexOutOfBoundsException{
    	
    }
    	
}
class Child extends Father0IfSonRun{
//public void action() throws Exception{//子类抛出的异常不能比父类的高级
//	                                           //也必须在父类异常之内 	
//    }
//	public void action() throws FileNotFoundException{
//		//SQLexception并不是在其内  因此也不可以抛出
//	}
	//运行时异常不受约束
	public void action() throws RuntimeException{
		
	}
}