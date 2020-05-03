package Nine;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
    private int age;
    private String grade;
    public Student() {
    	
    }
    public Student(String name,int age,String grade) {
    	this.name =name;
    	this.age = age;
    	this.grade = grade;
    }
    public String toString() {
    	return "  name:"+name+"  age:"+age+"  grade:"+grade;
    }
}
