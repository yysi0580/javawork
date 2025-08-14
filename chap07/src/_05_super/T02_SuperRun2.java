package _05_super;

class GrandChild extends Child3{
	int x = 10*10*10;
	void show() {
		System.out.println("자손클래스 메소드");
	}
}

class Parent3{
	int x = 10;
	void show() {
		System.out.println("부모클래스 메소드");
	}
}


class Child3 extends Parent3 {
	int x = 20;
	
	void show() {
		System.out.println("자식클래스 메소드");
	}
	
	void display() {
		show();
		super.show();
		System.out.println("this.x = " + this.x); 
		System.out.println("super.x = " + super.x);
	}
}

public class T02_SuperRun2 {
	public static void main(String[] args) {
		Child3 c = new Child3();
		GrandChild c2 = new GrandChild();
		c.display();
	}
}
