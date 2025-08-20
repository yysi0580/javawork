package _04_HashMap;

import java.util.*;

/*
 * Map
 	- 키와 값의 쌍으로 이루어져 있다
 	- 값을 얻어올 때 키값으로 얻어온다.
 	- Map계열은 Collection을 구현한 클레스가 아님
 		: 넣을 때는 put() 사용
 	1. HashMap
 	2. TreeMap
 */



public class T01_HashMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("아무개", 97);
		map.put("더조은", 100);
		map.put("홍길동", 86);
		map.put("아더워", 96);
		map.put("아..", 78);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("홍길동 : " + map.get("더조은"));
		System.out.println(map);
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		//키와 값이 들어있는 entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()){
			Map.Entry<String, Integer> entry = entryIterator.next();
		String key = entry.getKey();
		Integer value = entry.getValue();
		System.out.println(key + ":" + value);
		}
		
	}

}
