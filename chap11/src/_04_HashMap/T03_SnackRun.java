package _04_HashMap;

import java.util.*;

public class T03_SnackRun {

	public static void main(String[] args) {
		/*키 = String
		 * 값 = Snack 객체
		 */
		HashMap<String, Snack> hm = new HashMap<>();
		hm.put("칸초",new Snack("단맛", 300));
		hm.put("쵸코비",new Snack("단맛", 400));
		hm.put("새우깡",new Snack("짠맛", 500));
		hm.put("초코송이",new Snack("단맛", 600));
		hm.put("포카칩",new Snack("짠맛", 700));

		System.out.println(hm);
		
		hm.put("새우깡",new Snack("매운맛", 500));
		
		System.out.println(hm);
		
		
		
		Snack s = hm.get("다이제스트");
		System.out.println(s);
		
		System.out.println(hm.size());
		hm.replace("포테이토칩", new Snack("짠맛", 300));
		System.out.println(hm);
		
		Set keySet = hm.keySet();
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = hm.get(key);
			System.out.println(key + "=" + value);
		}
		
	}

}
