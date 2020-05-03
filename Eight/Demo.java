package Eight;

import java.util.*;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
    Set a = new TreeSet();
    ChongxieEC p1 = new ChongxieEC(1,17,"小智");
    ChongxieEC p2 = new ChongxieEC(2,18,"小霞");
    ChongxieEC p3 = new ChongxieEC(3,20,"小刚");
    a.add(p1);
    a.add(p2);
    a.add(p3);
    a.add(p1);//重复的元素不会被添加
    System.out.println(a.size());
    
}
}