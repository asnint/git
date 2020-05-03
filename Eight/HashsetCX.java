package Eight;

import java.util.*;

public class HashsetCX {
   public static void main(String[] args) {
	Set set = new HashSet();
	Student p1 = new Student(1,"小智");
	Student p2 = new Student(2,"小霞");
	Student p3 = new Student(3,"小刚");
	set.add(p1);
	set.add(p2);
	set.add(p3);
//	p2.id =5;
//	set.remove(p2);因为是根据id去排序
	//所以id = 5的hashcode会被删除 但是在集合中
	//还是为2的存储 所以删不掉
	//set.add(null);//treeset不可以添加
	System.out.println("集合的长度"+set.size());
	Iterator it = set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
