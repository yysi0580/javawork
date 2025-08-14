package _02_method;

public class mainMethon {

	public static void main(String[] args) {
		T01_apiMethod obm1 = new  T01_apiMethod();
		obm1.print1();
//		주의 : 반환형이 없는(void) 메소드는 값을 저장할 수 없고
//		출력문 사용도 안됨
		
		obm1.print2();
		obm1.print3();
		
		int result = obm1.print2();
		System.out.println(result);
		System.out.println(obm1.print3());
//		System.out.println(obm1.print1()); void, 반환형이 없어 출력할 수 없음
		obm1.print4(5);
		
		int result2 = obm1.print5(7, 10);
		System.out.println(result2);
		System.out.println(obm1.print5(8, 2));
		
		String name = obm1.print6(24, "더조은","서울");
		T02_apiOp op = new T02_apiOp();
		
		int three = 3;
		int five = 5; 
		System.out.printf("%d + %d = %d",op.add(five,three));
		System.out.printf("%d - %d = %d",op.minus(five, three));
		System.out.printf("%d * %d = %d",op.multiply(five, three));
		System.out.printf("%d / %d = %d",op.divide(five, three));
		System.out.printf("%d % %d = %d",op.remainder(five, three));
		
		
	
		
		
		
	}
}
