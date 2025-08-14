package _01_abstract;

public class Frog extends Pet{
	
	Frog(){
		this("청개구리", "초록색","말을 안들음");
	}
	
	public Frog(String kind, String color, String feature) {
		super(kind, color, feature);
		// TODO Auto-generated constructor stub
	}
	@Override
	void sound() {
		System.out.println("개굴개굴");
	}
	@Override
	void info() {
		System.out.println("종류 : " + getFeature());
	}
	
}
