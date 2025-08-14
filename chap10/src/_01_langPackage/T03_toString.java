package _01_langPackage;
/*
 *  toString()
 	참조변수를 출력하면 toString()이 호출되고,
 	패키지명.클래스명@hashCode (hashCode는 16진수로) 출력됨
 */
class Card {
	String kind;
	int num;
	Card() {
		this("HEART", 7);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	// toString()오버라이딩 하여 값이 출력되어야함
	@Override
	public String toString() {
		return kind + ", " + num;
	}
}
public class T03_toString {
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("SPADE", 10);
		Card card3 = null;
		
		
		

	}
}