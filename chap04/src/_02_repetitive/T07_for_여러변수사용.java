package _02_repetitive;

public class T07_for_여러변수사용 {

	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = num2 = num3 = 10;
		
		int num4 = 10, num5 = 20, num6 = 30;
		
		
		//for문에 여러개의 변수를 사용시
		// ** 주의 : 조건식에는 변수가 하나만 들어가야 함 들어가는 크기가 bool대수 하나만 들어간다
		for(int i = 1, j = 20; i <= 10; i++, j--) {
			System.out.printf("i = %d, j = %d\n", i, j);
		}

		for(int i = 1, j = 20, k = 100; i <= 10; i++, j--, k += 5) {
			System.out.printf("i = %d, j = %d k = %d\n", i, j, k);
		}
		
		//while(true)문과 동일
		for(;;) {
			System.out.println(num1++);
			if(num1 == 15)
				break;
		}
		
	}

}
