package _10_PolymorphismExPet;

public class Dog extends Pet {
	Dog(){
		super("이탈리안 그레이 하운드","gray","김율");
	}	
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
	public void sound() {
		System.out.println("멍멍");	
	}
}

