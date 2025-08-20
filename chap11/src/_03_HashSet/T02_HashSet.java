package _03_HashSet;

import java.util.HashSet;
import java.util.Set;

public class T02_HashSet {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(num[1]);
		
		System.out.println(set1);
		
		
		Object[] objArr = {"1", Integer.valueOf(1),"2","2","3","3","4","4","4"};
		HashSet set2 = new HashSet();
		
		for(Object obj : objArr) {
			set2.add(obj);
		}
		System.out.println(set2);
		
		Set<String> set3 = new HashSet<>();
		set3.add("java");
		set3.add("JDBC");
		set3.add("servlet");
		set3.add("oracle");
		set3.add("java");
		
		System.out.println("총 객체 수 : " + set3.size());
		System.out.println(set3);
		
		set3.remove("JDBC");
		set3.remove("oracle");
		
		System.out.println("총 객체 수 : " + set3.size());
		
		set3.clear();
		if(set3.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("객체가 들어있음");
		}
		
		
		
		
	}

}
