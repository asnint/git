package Eight;

import java.util.*;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
    Set a = new TreeSet();
    ChongxieEC p1 = new ChongxieEC(1,17,"С��");
    ChongxieEC p2 = new ChongxieEC(2,18,"Сϼ");
    ChongxieEC p3 = new ChongxieEC(3,20,"С��");
    a.add(p1);
    a.add(p2);
    a.add(p3);
    a.add(p1);//�ظ���Ԫ�ز��ᱻ���
    System.out.println(a.size());
    
}
}