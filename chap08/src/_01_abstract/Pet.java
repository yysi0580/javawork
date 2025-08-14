package _01_abstract;
/*
 * 추상 클래스 : 클래스 앞에 abstract키워드 사용
 			  추상메서드가 1개이상 포함되어 있으며 반드시 추상클래스로 해야 함
 	- 추상메서드 : 메서드에 선언부만 있고 내용(프로그램)이 없는 메소드
 				ex) void 메서드명(매개변수); // 추상메소드 앞에 abstract
 				=> abstract void 메서드명(매개변수);
 	> 추상클래스는 객체를 생성할 수 없다(그래서 상속 받아서 사용)
 */
public abstract class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
		
	}

	//추상 메서드 : 상속받는 곳에서 반드시 구현해야됨
	abstract void sound();
	abstract void info();
	
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ",특징" + feature;
	}
}
