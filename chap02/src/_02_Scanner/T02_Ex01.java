package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 사용자로부터 입력받아 저장하고
		// 총점과 평균을 출력하세요
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요");
		int lag = scan.nextInt();
		System.out.print("컴퓨터점수를 입력하세요");
		int com = scan.nextInt();
		System.out.print("수학점수를 입력하세요");
		int math = scan.nextInt();
		int sum = lag + com + math;
		double avg = sum / 3;
		System.out.println("총 점수 : " + sum);
		System.out.println("평균점수 : " + avg);
	}

}
