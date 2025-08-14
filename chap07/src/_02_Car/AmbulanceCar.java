package _02_Car;

public class AmbulanceCar extends Car {
	AmbulanceCar(String model, String company) {
		super(model, company);
	}
	boolean siren;
	void siren(){
		if(siren) {
			speed = 0;
			System.out.println("응급상황 종료");		
		}
		else {
			System.out.println("응급상황 에에에에에에에에에에에에에에에엥");
		}
		siren = !siren;
	}
	void firstAid(){
		System.out.println("응급처치를 시작합니다.");
	}
}
