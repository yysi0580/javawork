package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch-case
		int num1 = 2;
		
		switch(num1) {
			case 1:
				System.out.println("1입니다");
			case 2:
				System.out.println("2입니다");
			case 3:
				System.out.println("3입니다");
			default :
				System.out.println("1, 2, 3을 제외 한 수");
				
		System.out.println("-------------------------------");
		}
		
		char ch = 'k';
		
		switch(ch) {
			case 'k':
				System.out.println("김씨입니다");
			case 'l':
				System.out.println("이씨입니다");
			case 'p':
				System.out.println("박씨입니다");
		}
		
		System.out.println("-------------------------------");
		
		

		int month = 3;
		switch(month) {
		case 1:
			System.out.println("겨울");
			break;
			//12개
		}
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			break;
		}
		
		//문1) 사용자로부터 연산자(+, -, *, /, %)와 2숫자를 입력받아 연산한 결과 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("연산자를 입력하세요 : ");
		char carcul = scan.next().charAt(0);
		System.out.print("연산할 정수 2개를 입력하세요 (구분자 띄어쓰기) : ");
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		/*
		System.out.print("연산할 식을 입력해주세요 (ex. 3 + 5 = ) : ");
		int num2 = scan.nextInt();
		char carcul = scan.next().charAt(0);
		int num3 = scan.nextInt();*/
		switch(carcul) {
		case '+':
			System.out.printf("덧셈 결과는 : %d",num2 + num3);	
			break;
		case '-':
			System.out.printf("뺼셈 결과는 : %d",num2 - num3);
			break;
		case '*':
			System.out.printf("곱셈 결과는 : %d",num2 * num3);
			break;
		case '/':
			System.out.printf("나눗셈 결과는 : %.2f",num2 / (double)num3);
			break;
		case '%':
			System.out.printf("나눗셈 나머지는 : %d",num2 % num3);
			break;
		default:
			System.out.println("연산자가 아닙니다.");
			break;
		
		
			
		}
		if (carcul == '+') {
		
			System.out.printf("덧셈 결과는 : %d",num2 + num3);	
		}else if(carcul == '-') {
			System.out.printf("뺼셈 결과는 : %d",num2 - num3);
		}else if(carcul == '*') {
			System.out.printf("곱셈 결과는 : %d",num2 * num3);
		}else if(carcul == '/') {
			System.out.printf("나눗셈 결과는 : %.2f",num2 / (double)num3);
		}else if(carcul == '%') {
			System.out.printf("나눗셈 나머지는 : %d",num2 % num3);
		}else {
			System.out.println("연산자가 아닙니다.");
		}
	}
}
