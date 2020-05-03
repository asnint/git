
public class Test2 {
   public static void main(String[] args) {
	Test2 test = new Test2();
//	Person tom = new Student("tom");
//	Person jack = new Teacher("jack");
//	Teacher tr = (Teacher) jack;
//	
	test.func1(new Teacher("jack"));
	}
   public void func1(Person p) {
	   if (p instanceof Student) {
		   System.out.println("是一个学生");
		   Student sut = (Student) p;
	   }else if (p instanceof Teacher) {
		   System.out.println("是一个老师");
		   Teacher tea = (Teacher) p;
	   }
   }
}
 class Person {
	 String name;
 public Person(String name) {
		System.out.println("hello"+name);
	}
}
class Student extends Person {
	public Student(String name) {
		super(name);
 //TODO Auto-generated constructor stub
	}
}
class Teacher extends Person {

	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
