package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자 -> 조건식 ? 조건이 참일 때 실행 : 조건이 거짓일 때 실행
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1이 더 작다" : "num1이 더 크다";
		
		char charresult = num1 < num2 ? '소' : '대';
		System.out.println(charresult);
		
		int num3 = -5;
		int result2 = num3 >= 0 ? num3 : num3 * -1; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		String result3 = score > 80 ? "합격" : "불합격";
		System.out.println(result3);
		String grade = score > 100 ? "점수를 잘못 입력하였습니다." : 
			score >= 90 ? "A 학점" : 
				score >= 80 ? "B 학점" : 
					score >= 70 ? "C 학점" : 
						score >= 60 ? "D 학점" : 
							score >= 0 ? "F 학점" : "점수를 잘못 입력하였습니다.";
		System.out.printf("당신의 점수는 %s 입니다.\n",grade);
		
		
	}

}
