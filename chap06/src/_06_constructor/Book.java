package _06_constructor;

class ThisBook {
	String name;
	int prise;
	double ISBN;

	ThisBook() {
		this("어린왕자",20000,300.0);
		System.out.println("매개변수가 없는 생성자");
	}
	ThisBook(String name) {
		this(name,20000,300.0);
		System.out.println("매개변수가 1개인 생성자");
	}
	ThisBook(String name, int prise) {
		this(name,prise,300.0);
		System.out.println("매개변수가 2개인 생성자");
	}
	ThisBook(String name, int prise, double ISBN) {
		this.name = name;
		this.prise = prise;
		this.ISBN = ISBN;
		System.out.println("매개변수가 3개인 생성자");
	}
	void info() {
		System.out.println("int : " + prise);
		System.out.println("String : " + name);
		System.out.println("double : " + ISBN);
	}
}
	public class Book {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisBook book = new ThisBook();
		book = new ThisBook();
		System.out.println("--------------------");
		book.info();
	}

}
