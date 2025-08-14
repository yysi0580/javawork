package _02_Scanner;

public class T03_printf {

	public static void main(String[] args) {
		//십진수 출력
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d", 20, 10);
		int num1 = 100;
		int num2 = 200;
		System.out.format("%d, %d\n", num1, num2);
		
		//8진수 출력
		System.out.printf("%o\n", 8);
		
		//16진수 출력
		System.out.format("%x\n", 10);
		
		//실수형 출력
		System.out.printf("%f\n", 5.77777777);
		
		//char 출력
		System.out.format("%c\n", 'a');
		
		//문자열 출력
		System.out.printf("%s\n", "werljkwelkrj");
		
		//bool대수 출력
		System.out.format("%b\n", true);
		System.out.format("%b\n", 10 > 4);
		
		/* 숫자만 %로
		 현재는 2025년 8월 이고, 우리나라의 평균 온도는 34.5도입니다.
		 이 과정의 정원은 25명이고. 현재 19명이 수강중입니다. 76% 달성하였습니다.
		 */
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균 온도는 %.1f 입니다.\n과정의 정원은 %d명이고, 현재 %d명이 수강중입니다. %d%% 달성하였습니다.", 2025, 8, 34.5, 25, 19, 76);
	}

}
