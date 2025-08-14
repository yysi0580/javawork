package _01_abstract;

public class Dog extends Pet{
	
	Dog(){
		this("시고르자브종", "흰색","똥을 잘먹음");
	}
	
	public Dog(String kind, String color, String feature) {
		super(kind, color, feature);
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}
	@Override
	void info() {
		System.out.println("종류 : " + super.getKind());
	}
	
}
