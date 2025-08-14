package _02_Car;

import _02_Phone.SmartPhone;

public class AmbulanceCarRun {

	public static void main(String[] args) {
		AmbulanceCar am = new AmbulanceCar("포터","횬대");
		am.goAndStop();
		am.speedUp(30);
		am.speedDown(30);
		am.siren();
		am.firstAid();
		am.goAndStop();
	}

}
