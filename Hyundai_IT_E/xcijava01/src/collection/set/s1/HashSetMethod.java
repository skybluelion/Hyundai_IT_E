package collection.set.s1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

	public static void main(String[] args) {
		Set<String> hSet1 = new HashSet<>();
		//1.add
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");
		System.out.println(hSet1.toString());
		
		//2. addAll
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println(hSet2.toString());
		
		//3. remove
		hSet2.remove("나");
		System.out.println(hSet2.toString());
		
		//4.clear
		hSet2.clear();
		System.out.println(hSet2.toString());
		
		//5. isEmpty()
		System.out.println(hSet2.isEmpty());
		
		//6. contains
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3.contains("나"));
		System.out.println(hSet3.contains("라"));
		
		//7.size
		System.out.println(hSet3.size());
		
		//8.iterator()
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//9. toArray()
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));

		//10-1. toArray(T[] t)
		String[] strArray1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray1));
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		
		
		
		
		
	}

}
