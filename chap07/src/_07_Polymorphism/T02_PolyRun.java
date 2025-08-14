package _07_Polymorphism;

class Parent {
	void method1() {
		System.out.println("child method1()");
	}

	void method2() {
		// TODO Auto-generated method stub
	}

}

class Child extends Parent{
	@Override
	void method2() {
		System.out.println("child method2()");
	}
	void method3() {
		System.out.println("child method3()");
	}

}

public class T02_PolyRun {

	public static void main(String[] args) {
		

	}

}
