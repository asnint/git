package Eight;

import java.util.*;

public class GDlist {
    	public static void main(String[] args) {
    		String[] ss = { "aaa", "ccc", "ddd", "eee" };
    		List<String> list = Arrays.asList(ss);
    		list.set(0, "xxx");
    		System.out.println(list);
    		
    		list.add("fff");
    	}

	}
