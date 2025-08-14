package _03_interface2;
/*
 * interface : 일종의 추상클래스인데 추상클래스보다 추상화가 더 높다
  				추상메소드만 포함(일반메소드 없음)
  				추상메소드와 상수만 멤버로 가질 수 있음(변수 사용못함)
 				객체생성 할 수 없음
 				상속받는곳에서는 implements 키워드 사용(extend 사용 안함)
 				implement는 여러개사용가능
 
 	- 사용 : 표준 인터페이스를 만들어 어떠한 객체가 들어오더라도 호출시 이름 동일하게 호출
 */
public interface Inter {
	static final double PI = 3.14;
	int MAX = 100; //컴파일시 pubilx static fical을 자동으로 붙여줌
	
	//추상 메서드만 사용가능
	public abstract void print(int a);
	public abstract void method();
	String str(String name); // 컴파일시 public abstract를 자동으로 붙여줌
	
}
