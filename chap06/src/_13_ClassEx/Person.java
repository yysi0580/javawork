package _13_ClassEx;



public class Person {
	String name;
	String gender = "성별";
	int age;
	int height;
	int weigh;

			
			
	public static void main(String[] args) {
		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();

		System.out.println("ex1 ==ex2 : "+ (ex1 == ex2));
		
	}
		

}

class Excercise {
	static Excercise ex = new Excercise();
	
	private Excercise() {
		System.out.println("객체 생성");
	}
	static Excercise getInstance() {
		return ex;	
	}
}
