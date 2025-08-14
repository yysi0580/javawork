package _10_PolymorphismExPet;

public class Pet {
	String kind;
	String color;
	String feature;
	
    Pet(String kind, String color,String feature) {
    	this.kind = kind;
    	this.color = color;
    	this.feature = feature;
    }
	
	void sound() {
		System.out.println("...");
	}
	void info() {
		System.out.println("종류 : " + kind + " 색상 : " + color);
	}
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}  

}
		
		
		
//		api? :
//			   Pet
//			     속성 : kind
//			            	color
//			          feature  // 지랄견
//			          생성자 : Pet(kind, color, feature) { }
//			     메소드 :
//			          sound()
//			          info() {출력문}    종류 : 비글, 색상 : 흰색
//			           getter메소드
//			          getKind() 
//			          getColor()	
//			          getFeature()
			          // 오버라이딩
//			          toString() {return  }   종류 : 비글, 색상 : 흰색, 특징 : 지랄견

//			   Cat (Pet상속)
			        // 생성자 2개
//			        Cat() { 매개변수3개인 생성자에 값 넘겨주기}
//			        Cat(kind, color, feature) { }
			        // 오버라이딩
//			        sound()
//			   Dog (Pet상속)
//			   Frog (Pet상속)

//			main :
//			  Pet pet1 = new Cat()
//			  Pet pet2 = new Dog()