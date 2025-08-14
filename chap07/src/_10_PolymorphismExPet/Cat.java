package _10_PolymorphismExPet;

public class Cat extends Pet {
	Cat(){
		super("코숏","blue","똥냥이");
	}	
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
	public void sound() {
		System.out.println("야옹");	
	}
}
//생성자 2개
//Cat() { 매개변수3개인 생성자에 값 넘겨주기}
//Cat(kind, color, feature) { }
// 오버라이딩