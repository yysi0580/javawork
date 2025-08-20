package _05_TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		Integer[] arr = {1,4,6,7,3,2,8,9,5,4,2,6,7,9};
		Set<Integer> set = new TreeSet<Integer>();
		for(Integer i : arr)
			set.add(i);
		
		System.out.println(set);
		
		//navigableSet
//			java의 set 인터페이스를 확장한 컬렉션 인터페이스
//			정렬된 순서로 저장하고, 
//			그 요소에 다양한 탐색작업을 지원하는 메서드 제공
//			sortedSet 인터페이스도 확장하고있기 때문에 정렬된 순서로 데이터를 다룰 수 있다
		/*
		 * 
		 */
		

	}

}
