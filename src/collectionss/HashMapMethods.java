package collectionss;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
	public static void main(String[] args) {
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		hm2.put(1, "Geeks");
		hm2.put(2, "For");
		hm2.put(3, "Geeks");
		System.out.println("Mapping of HashMap hm2 are : " + hm2);

		hm2.put(4, "For2");

		System.out.println("Updated Map " + hm2);

		hm2.remove(4);

		// Final HashMap
		System.out.println("Mappings after removal are : " + hm2);
		// Iterate the map using for-each loop
		for (Map.Entry<Integer, String> e : hm2.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
	}

}
