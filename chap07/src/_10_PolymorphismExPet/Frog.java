package _10_PolymorphismExPet;

public class Frog extends Pet {
	Frog(){
		super("화살촉개구리","green","두꺼비");
	}	
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
	public void sound() {
		System.out.println("개굴개굴");	
	}
}