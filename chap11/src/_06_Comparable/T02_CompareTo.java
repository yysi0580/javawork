package _06_Comparable;

import java.util.*;

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		//return c1.compareTo(c2);
		return c2.compareTo(c1);
		}
		return -1;
	}
	
}

public class T02_CompareTo {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr); // String의 Comparable구현에 의해 정렬(유니코드 순)
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);  // 대소문자 구분 안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr);  // 대소문자 구분 안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		

	}

}
