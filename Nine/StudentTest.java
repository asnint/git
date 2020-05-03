package Nine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	public static void main(String[] args) {
    try {
    	ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("d:\\s.txt"));
    Student stu=new Student("FAL",19,"¥Û“ª");
		OOS.writeObject(stu);
		OOS.close();
     ObjectInputStream OIS= new ObjectInputStream(new FileInputStream("d:\\s.txt"));
     Student stu1=(Student) OIS.readObject();
     System.out.println(stu1);
		OIS.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}