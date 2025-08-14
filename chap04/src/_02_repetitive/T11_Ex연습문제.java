package _02_repetitive;

import java.util.Scanner;
import java.util.Stack;

public class T11_Ex연습문제 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0;i <= 100;i += 5) {
			sum += i;
		}
		
		System.out.println("5의 배수의 합계는" + sum);
		

		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0;i <= 100;i++) {
			if(i % 2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}

		System.out.println("짝수의 합계는" + evenSum);
		System.out.println("홀수의 합계는" + oddSum);
		
		
		for(int x = 1; x <= 6; x++) {
			for(int y = 1; y <= 6; y++) {
				if( x + y == 6)
					System.out.printf("(%d,%d)\n", x, y);
				
			}
		}
		System.out.printf("\n");//4번문제 
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");//5번문제
		
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		//6번문제
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
		}
		
		System.out.printf("\n");//7번문제
		
		System.out.println("[실행 결과]\n");
		
		Stack<Integer> stack = new Stack<>();
		for(;;) {
			int rand1 = (int)(Math.random() * 6) + 1;
			
			stack.push(rand1);
			if(rand1 == 6) {
				break;
				}
			
		}
		int count = 0;
		for(int i = 0; i < stack.size(); i++) {
			System.out.printf("(%d)\n", stack.get(i));
			count++;
		}
		System.out.printf("총 주사위 굴린 횟수는 : %d회\n",count);

	}
}
