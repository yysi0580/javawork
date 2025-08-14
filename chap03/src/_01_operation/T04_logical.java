package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱과 논리합
		/*
		 x y 논리곱(&&) 논리합(||)
		 0 0    0        0
		 0 1    0        1
		 1 0    0        1
		 1 1    1        1
		 */
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1 > num2 && num1 < num2;
		System.out.println("논리곱 : "+ result);
		System.out.println("--------------------");
		
		result = num1 > num2 || num1 < num2;
		System.out.println("논리합 : " + result);
		System.out.println("--------------------");
		
		boolean b1 = num1 >= num2;
		System.out.println(b1);
		System.out.println(!b1);
		System.out.println(!!b1);
		System.out.println("--------------------");
		
		//A : 65, a : 97
		char ch1 = 'k';
		//대문자 : 65 ~ 96
		//소문자 : 97 ~ 128
		System.out.printf("소문자인가? : %b\n", ch1 >= 'a' && ch1 <= 'z');
		
		
		
		
		
	}

}
