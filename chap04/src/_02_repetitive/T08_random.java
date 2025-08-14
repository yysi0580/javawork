package _02_repetitive;

public class T08_random {

	public static void main(String[] args) {
		// Math클래스(수학에 관련된 클래스)
		double rand1 = Math.random();
		System.out.println(rand1);
		System.out.println("----------------");
		
		// 0 ~ 9.99999999..
		double rand2 = Math.random() * 10;
		System.out.println(rand2);
		System.out.println("----------------");
		
		// 0 ~ 9 정수
		int rand3 = (int)(Math.random() * 10);
		System.out.println(rand3);
		System.out.println("----------------");
		
		// 1 ~ 10 정수
		int rand4 = (int)(Math.random() * 10) + 1;
		System.out.println(rand4);
		System.out.println("----------------");
		
		// 1 ~ 3 정수
		int rand5 = (int)(Math.random() * 3) + 1;
		System.out.println(rand5);
		System.out.println("----------------");
		
		
	}

}
