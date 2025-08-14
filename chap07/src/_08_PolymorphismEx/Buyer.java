package _08_PolymorphismEx;

public class Buyer {
	int money = 500;
	int bonusPoint;
	
/*	void buy(Computer com) {
		if(money;
	}
	void buy(Tv tv) {
		
	}
	void buy(Game game) {
		
	}
}*/

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}