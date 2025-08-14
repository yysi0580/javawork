package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		// for문을 while 문으로 바꾸기
		for(int i = 1;i <= 5; i++) {
			System.out.println(i);
		}
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		int sum = 0;
		i = 1;
		while(i <= 100) {
			System.out.println(sum);
			sum += i++;
		}	
			
		int count = 0;
		while(true) {
			System.out.println(++count);
			
			if(count == 3)
				break;
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.printf("1문자 입력(끝내려면 'q'입력) : ");
			char ch = scan.next().charAt(0);
			
			System.out.println(ch);
			if(ch == 'q')
				break;
		
		}
		System.out.println("프로그램 종료");
		//사용자로부터 2개의 숫자를 입력받아 더한 숫자를 출력
		// 0을 입력하면 종료
		int count1 = 0;
		int sum1 = 0;
		while(true) {
			System.out.printf("정수 입력(끝내려면 '0'입력) : ");
			int num1 = scan.nextInt();
			sum1 += num1;
			count1++;
			if(num1 == 0)
				break;
			
			if(count1 == 2)
				break;
		
		}
		System.out.println(sum1);
		
	}
}
