package _07_static;

public class StaticField {
	// 인스턴스 필드
	int num = 3;
	String name = "인스턴스 필드";
	// 정적 필드
	static int stNum = 10;
	static String stName = stName = "정적 필드";
	
	// 인스턴스 메소드
	void method() {
		System.out.println("인스턴스 메소드 method()");
		System.out.println(num);
		System.out.println(stNum);
	}
	String methodSt() {
		System.out.println("인스턴스 메소드 method2");
		return stName;
	}
	// 정적 메소드
	/*
	 * 정적 필드만 사용 가능
	 	- 정적 필드는 객체를 생성하지 않아도 사용가능하지만 인스턴스 필드(메소드)는 반드시 객체가 생성되어야만 사용할 수 있다
	 	정적필드에서 인스턴스필드를 사용할 때는 반드시 객체가 생성되어 있다는 것을 담보로 할 수 없기 때문 
	 */
	static void stMethod() {
		System.out.println("정적메소드 stMethod()");
		System.out.println(stNum);
		//System.out.println(num); //사용하려면 객체를 호출해야 사용할 수 있음
		
	}
	static String stMethod2() {
		System.out.println("정적 메소드 stMethod2()");
		return stName;
	}
	
	
	
}
