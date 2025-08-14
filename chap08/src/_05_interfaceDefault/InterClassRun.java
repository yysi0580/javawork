package _05_interfaceDefault;

public class InterClassRun {

	public static void main(String[] args) {
			InterClass ic =new InterClass();
			System.out.println(ic.method());
			System.out.println(ic.method1());
			System.out.println(ic.method2());
			System.out.println("오버라이딩 안한 default deMe() : " + ic.deMe());
			System.out.println("오버라이딩 안한 default Me() : " + ic.me());
			System.out.println("오버라이딩 안한 static stMe() : " + Inter1.stMe());
	}

}
