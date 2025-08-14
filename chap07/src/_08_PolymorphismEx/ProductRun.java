package _08_PolymorphismEx;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Game());
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점");
		
		b.buy(new Game());
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점");
	}

}
