package _04_overriding;

class Over{
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}

class Overchild extends Over{
	void chow(String child) {
		System.out.println("자식클래스 메소드 : " + child);
	}
}

public class OverridngRun {

	public static void main(String[] args) {
		Overchild oc = new Overchild();
		oc.show("자바 프로그래밍");
		Over o = new Over();
		o.show("오라클");
		o = new Overchild();
	}

}
