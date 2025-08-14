package _09_PolymorphismExArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];
	int index = 0;
	
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
			
		}else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[index++] = p;
			System.out.println(p + "를 구입함");	
		}
		
		
	}
	void info() {
		int sum = 0;
		String list = "";
		
		for(int i = 0; i < cart.length;i++) {
			if(cart[i] == null)
				break;
			sum +=cart[i].price;
			list += cart[i] + ", ";
			System.out.println("깅한 물품의 총액" + sum);
			System.out.println("깅한 물품의 목록" + list);
		}
	}
}