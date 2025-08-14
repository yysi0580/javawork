package _11_staticEx;

public class Product {
	private String productNum;
	private static int count = 0;
	
	Product() {
		count++;
		this.productNum = "더조은" + count;
		System.out.println("생성된 제품 번호: " + productNum);
	}
	
	static int getCount() {
		return count;
	}
	
	/*public String getProductNum() {
		return productNum;
		
	}*/
}

