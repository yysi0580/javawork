package _11_staticEx;

public class Product_main {

	public static void main(String[] args) {
		Product p1 = new Product();  // 고유한 제품번호 (더조은1)
		Product p2 = new Product();   // 고유한 제품번호 (더조은2)
		Product p3 = new Product();   // 고유한 제품번호 (더조은3)
		System.out.println("잔액 : " + Product.getCount());
		
		
		Product p4 = new Product();   // 고유한 제품번호 (더조은4)
		Product p5 = new Product();   // 고유한 제품번호 (더조은5)
		System.out.println("잔액 : " + Product.getCount());
	}
	
}
