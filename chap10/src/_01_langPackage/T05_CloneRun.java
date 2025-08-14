package _01_langPackage;
/*
 * clone() : 복제
 	1. 반드시 clone하고자 하는 클래스에 implements cloneble 반드시 넣어줘야 함
 		 : '이 클래스는 복제할 수 있는 클래스이다' 라는 것을 알려줄 목적
 	2. clone()을 오버라이딩하지않아도 됨
 	   Object클래스의 clone()메소드의 접근제어자가 protected임.
 	   같은 java.lang패키지 안에 있어야 함
 	   
 */
class Point implements Cloneable {
	int x;
	int y;
	Point(){}
	Point(){
		this.x = x;
		this.y = y;
	}
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();

		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class T05_CloneRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
