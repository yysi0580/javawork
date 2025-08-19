package _02_arrayList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class T03_ArrayListMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5));
		List<Integer> list2 = List.of(1,2,3);
		
		
		// for문으로 넣기
		List<Integer> list3 = new ArrayList<>();
		for(int i=0;i < 100;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>(list.subList(1, 4)); // index -> 1 ~ 3
		System.out.println(list);
		
//		List<Integer> list
		Collections.sort(list);
		System.out.println("오름차순 정렬" + list);
		Collections.reverse(list);
		System.out.println("내림차순 정렬" + list);
		System.out.println("---------------------------");
		System.out.println("list는 list1의 요소를 모두 갖고 있는가?" + list.containsAll(list1));
		
		List<String> slist = new ArrayList<>();
		slist.add("B");
		slist.add("C");
//		slist.add(3,"A");
//		System.out.println(slist);
		slist.add(2,"AA");
		
		List<String> slist2 = new ArrayList<>();
		slist2.add("A");
		slist2.add("B");
		slist2.add("F");
		slist2.add("Z");
		
		//겹치는 부분만 남기고 나머지 삭제
		System.out.println("slist 에서 slist2와 겹치는 부분만 남기고 삭제 : " + slist.retainAll(slist2));
		System.out.println(slist);
		System.out.println(slist2);
		
		

	}

}
