package _07_Polymorphism;

class A {int a=1;}
class B extends A { int b = 2;}
class C extends A { int c = 3;}
class D extends B { int d = 4;}
class E extends C { int e = 5;}
public class T01_Polymorphism {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		System.out.println(b.a);
		A a2 = c;
		System.out.println(c.c);
		A a3 = d;
		System.out.println(d.b);
		A a4 = e;
		System.out.println(e.c);// A 클래스로 타입을 형변환 했기 때문에 A클래스만 사용 가능
		
	}

}
