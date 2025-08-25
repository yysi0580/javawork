package _07_comparable;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// return c1.compareTo(c2);  // 오름차순 정렬
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
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);  // 대소문자 구분 안함
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		// 내림차순 정렬의 class api 만들어서 사용
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr = " + Arrays.toString(strArr));
	}

}
