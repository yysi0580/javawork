package _06_Ex;

public class Game implements Product {
	private boolean power;
	private int volume = 0;
	private String gameName = "LOL";
	
	@Override
	public void powerOn() {
		if(!power) {
			System.out.println("전원이 켜졌습니다");
			power = !power;
		}else {
			System.out.println("전원이 켜져있습니다");
		}
	}

	@Override
	public void powerOff() {
		if(power) {
			System.out.println("전원이 꺼졌습니다");
			power = !power;
		}else {
			System.out.println("전원이 꺼져있습니다");
		}
	}

	@Override
	public void volumeUp(int amount) {
		if(volume >= MAX) {
			System.out.println("볼륨이 최대입니다.");
			return;
		}
		if(volume + amount >= MAX) {
			System.out.println("볼륨을 올릴 수 없습니다." + (MAX - volume) + "만큼 올릴 수 있습니다.");
			return;
		}
		volume += amount;
		
	}

	@Override
	public void volumeDown(int amount) {
		if(volume >= MAX) {
			System.out.println("볼륨이 최소입니다.");
			return;
		}
		if(volume + amount >= MAX) {
			System.out.println("볼륨을 내릴 수 없습니다." + (volume) + "만큼 내릴 수 있습니다.");
			return;
		}
		volume -= amount;
		
	}
	public void changeGame(String amount) {
		gameName = amount;
		
	}

}
