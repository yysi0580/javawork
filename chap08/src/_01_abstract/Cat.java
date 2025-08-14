package _01_abstract;

public class Cat extends Pet{
	
	Cat(){
		this("코숏", "회색","개냥이");
	}
	
	public Cat(String kind, String color, String feature) {
		super(kind, color, feature);
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		System.out.println("야옹");
	}
	@Override
	void info() {
		
	}
	
}
