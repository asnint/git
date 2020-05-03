package Eight;

import java.util.*;

public class SetNotRepeat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		String s3 = "World";
		String s4 = "World";
		Set set = new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set.size() + " " + set);

	}
}
