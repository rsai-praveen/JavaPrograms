package collectionss;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		// appending the value to set(can't identify the exact position)
		set1.add("hello");
		set1.add("world");
		System.out.println(set1);
		
		// deletes the value based on the value
		set1.remove("world");
		System.out.println(set1);

	}

}
