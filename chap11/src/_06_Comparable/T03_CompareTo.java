package _06_Comparable;

import java.util.*;

//class classes{
//	
//}

class Classes implements Comparator {
	String couresTitle;
	int prise;
	
	public Classes(String couresTitle, int prise) {
		this.couresTitle = couresTitle;
		this.prise = prise;
	}

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

	@Override
	public String toString() {
		return "Classes [couresTitle=" + couresTitle + ", prise=" + prise + "]";
	}
	
		public int compareTo(Classes o) {

			if(prise < o.prise)
				return -1;
			else if(prise == o.prise)
				return 0;
			else
				return 1;
		
	}
	
}

public class T03_CompareTo {

	public static void main(String[] args) {
		TreeSet<Classes> p1 = new TreeSet();
		p1.add(new Classes("온라인 프로그래밍 기초 강좌", 20));
		p1.add(new Classes("중급 개발 실무 강좌", 40));
		p1.add(new Classes("고급 전문 자격증 준비 강좌", 65));
		System.out.println(p1);
		
		
		
		System.out.println(p1);
		
		
	}
	
}
