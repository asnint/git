package Eight;

import java.util.*;

public class HashsetCX {
   public static void main(String[] args) {
	Set set = new HashSet();
	Student p1 = new Student(1,"С��");
	Student p2 = new Student(2,"Сϼ");
	Student p3 = new Student(3,"С��");
	set.add(p1);
	set.add(p2);
	set.add(p3);
//	p2.id =5;
//	set.remove(p2);��Ϊ�Ǹ���idȥ����
	//����id = 5��hashcode�ᱻɾ�� �����ڼ�����
	//����Ϊ2�Ĵ洢 ����ɾ����
	//set.add(null);//treeset���������
	System.out.println("���ϵĳ���"+set.size());
	Iterator it = set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
}
}
