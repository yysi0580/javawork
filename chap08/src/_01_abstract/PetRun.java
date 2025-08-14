package _01_abstract;

public class PetRun {

	public static void main(String[] args) {
//		추상클래스는 객체생성 할 수 없음
		//		Pet Pet1 = new Pet("셰퍼드","검정","똑똑함");
	
		Frog frog = new Frog();
		Pet pet1 = new Frog("황소개구리","갈색","엄청 잘먹음"); // 사형성 : 추상클래스는 형변환 가능
		pet1.info();
		System.out.println(pet1); // 패키지명.클래스@주소
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		pet1 = new Cat();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		
		pet1 = new Dog();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		
		
	}

}
