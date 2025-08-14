package _04_interfaceExtends;
/*
 * interface : 일종의 추상클래스인데 추상클래스보다 추상화가 더 높다
  				추상메소드만 포함(일반메소드 없음)
  				추상메소드와 상수만 멤버로 가질 수 있음(변수 사용못함)
 				객체생성 할 수 없음
 				상속받는곳에서는 implements 키워드 사용(extend 사용 안함)
 				implement는 여러개사용가능
 
 	- 사용 : 표준 인터페이스를 만들어 어떠한 객체가 들어오더라도 호출시 이름 동일하게 호출
 */

// 같은 interface에서 상속 받을 때는 extends 키워드로 상속 받음
// 다중 상속 가능
interface Inter1 {
	int method1();
	
}

interface Inter2 {
	int method2();
	
}
public interface Inter extends Inter1, Inter2{
	int method();
	
}