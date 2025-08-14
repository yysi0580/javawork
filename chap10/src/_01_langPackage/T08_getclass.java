package _01_langPackage;
/*
 * Object의 toString()
   참조변수를 출력하면 toString()이 호출되고, 
   패키지명.클래스명@hashCode (hashCode는 16진수로) 출력됨
 */
class Card2 {
	String kind;
	int num;
	Card2() {
		this("HEART", 7);
	}
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	// toString() 오버라이딩하여 값이 출력되게 함
	@Override
	public String toString() {
		return kind + ", " + num;
	}
}
public class T08_getclass {
	public static void main(String[] args) {
		Card2 card1 = new Card2("SPADE",3);
		System.out.println(card1);
		
		System.out.println(card1.getClass());
		
		System.out.println(card1.getClass().getName());

	}
}