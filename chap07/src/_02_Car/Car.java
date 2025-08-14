package _02_Car;

public class Car {
	String model;
	String company;
	boolean power;
	int speed = 0;
	
	Car(String model, String company){
		this.model = model;
		this.company = company;
	}
	void goAndStop(){
		if(power) {
			speed = 0;
			System.out.println("시동을 끕니다");		
		}
		else {
			System.out.println("시동을 켭니다");
		}
		power = !power;
	}
	void speedUp(int upSpeed){
			speed += upSpeed;
			System.out.println("출발합니다");
	}
	void speedDown(int upSpeed) {
		speed -= upSpeed;
		System.out.println("출발합니다");
	}
		
}
