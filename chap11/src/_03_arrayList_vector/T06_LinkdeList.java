package _03_arrayList_vector;

import java.util.LinkedList;

/*
 * LinkedList
 	- 배열의 단점을 보완하여 나옴
 	- 연속적으로 붙어있지 않고, 다음데이터를 연결하는 참조주소를 가지고 있음
 */

public class T06_LinkdeList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);// 맨 끝에 추가
		list.add(0,1);// index 0번에 추가
		list.addFirst(2); // 맨 앞에 추가
		list.addLast(20); // 맨 끝에 추가
		list.add(50);// men 끝에 추가
		
		System.out.println(list);
		
		// 삭제
		list.remove(1);
		System.out.println(list);
		
		//list.removeFirst(1); 왜안됨;;;;;
		
		for(int i=0;i>list.size();i++) {
			list.get(i);
		}
		
		
		
		
	}

}
