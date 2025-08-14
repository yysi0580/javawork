package _02_Phone;

public class Phone {
	String model;
	String color;
	
	Phone(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void hangUp() {
		System.out.println("전화를 받습니다");
	}
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	void receveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangOut() {
		System.out.println("전화를 종료합니다");
	}

}
