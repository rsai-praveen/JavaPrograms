package collectionss;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		//ArrayList<String> arr1 = new ArrayList<String>();
		
		System.out.println("initilazing ArrayList "+arr);
		
		// appending the value end of Array List
		arr.add("hello");
		System.out.println("initilazing ArrayList "+arr);
		
		// appending value based on index
		arr.add(1,"world");
		System.out.println("initilazing ArrayList "+arr);
		
		//return the value based on index
		System.out.println("The value at index 0 is :"+arr.get(0));
		
		// returns index based on value
		System.out.println("The index of value 'Hello' is : "+arr.indexOf("hello"));
		
		// returns the size of array
		System.out.println("The size of the array : "+arr.size());
		
		// deletes the value based on index
		arr.remove(0);
		System.out.println("initilazing ArrayList "+arr);
		
		// deletes the value based on the value
		arr.remove("world");
		System.out.println("initilazing ArrayList "+arr);
	}

}
