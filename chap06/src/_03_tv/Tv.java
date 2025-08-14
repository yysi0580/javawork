package _03_tv;

public class Tv {
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 80;
	boolean power;
	int volume;
	int channel = 5;
	
	
	void power() {
		//power = true;// 1번째 호출
		//power = false; //2번째 호출
	
		power = !power;
		
		if(power)
			System.out.println("tv를 켭니다");
		else
			System.out.println("tv를 끕니다");
	}
	int channelUp() {
		channel++;
		return channel;
	}	
	int channeldown() {
		channel--;
		return channel;
	}
	
	int volume(int volume) {
		return volume;

	}
}
