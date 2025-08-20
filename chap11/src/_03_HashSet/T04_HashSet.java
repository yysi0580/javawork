package _03_HashSet;

import java.util.*;

public class T04_HashSet {

	public static void main(String[] args) {
		
		//lotto만들기 1부터 45숫자중 6개 추출하여 set에 넣기
		Set<Integer> set = new HashSet<>();
        
        while(set.size() < 6) {
        	int num = (int)(Math.random()*45)+1;
        	set.add(num); 
        }

        System.out.println("로또 번호: " + set);
		    
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
        
        
		
	}

}
