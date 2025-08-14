package _02_repetitive;

public class T01_for {

	public static void main(String[] args) {
		// 반복문 : 원하는 개수반큼 반복 실행
		/*
		 for(초기식; 조건식; 증감식) {
		 	실행문
		 }
		 */
		
		for(int i = 1;i <= 100; i++ ) {
			System.out.println(i + ". 안녕하세요");
			System.out.println("   반갑습니다");
		}
		for(int i = 1;i <= 10; i += 2) {
			System.out.println(i + ". 안녕하세요");	
		}
		System.out.println("---------------");
		int sum = 0;
		for(int i = 1;i <= 100; i++) {
			sum = sum + i;	
		}
		System.out.println(sum);
	}
}
