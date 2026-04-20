package stringprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
	public static HashMap<String,Integer> duplicate(String s)
	{
		String[] s1=s.split("");
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		HashSet<String> set1=new HashSet<String>(Arrays.asList(s1));
		
		for(String a:set1)
		{
			int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(a.equals(s1[i]))
			{
				count++;
			}
		}
		map.put(a, count);
		}
		return map;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string-1 want to check duplicate characters: ");
		String str1 = sc.nextLine();
		System.out.println();
		sc.close();
		HashMap<String,Integer> map1=duplicate(str1);
		for(Map.Entry<String,Integer> entry:map1.entrySet() )
		{
			System.out.println(entry.getKey()+" , "+entry.getValue());
		}

	}

}
