package _03_casting;

import java.util.Random;
import java.util.Scanner;

public class T04_Ex01 {

	public static void main(String[] args) {
//		1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
//		2. 국어, 영어, 수학 점수를 입력받아 총점 출력
//		    평균 출력(소수점 2째자리까지 출력)
//		3.  int iNum1 = 10;
//		    int iNum2 = 4;
//		    float fNum = 3.0f;
//		    double dNum = 2.5;
//		    char ch = 'K'; 

//		   3.1  iNum1 / iNum2의 몫 출력
//		   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
//		   3.3  iNum1의 값이 10.0으로 출력되게 하기
//		   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
//		   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
//		   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
//		   3.7  ch변수의 유니코드 출력하기
//		   3.8  ch변수에 1을 더해 L 이 출력되게 하시오
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
//		1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
	    System.out.println("문자 하나 입력");
		char num12312 = scan.next().charAt(0);
		System.out.println((int)num12312);
		
		//2. 국어, 영어, 수학 점수를 입력받아 총점 출력
//	    평균 출력(소수점 2째자리까지 출력)
		System.out.print("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.print("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.print("수학점수를 입력하세요");
		int math = scan.nextInt();
		int sum = kor + eng + math;
		double avg = sum / 3;
		System.out.printf("총 점수 : %d\n", sum);
		
		System.out.printf("평균점수 : %.2f\n", avg);
		
//		3.  int iNum1 = 10;
//	    int iNum2 = 4;
//	    float fNum = 3.0f;
//	    double dNum = 2.5;
//	    char ch = 'K'; 

//	   3.1  iNum1 / iNum2의 몫 출력
//	   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
//	   3.3  iNum1의 값이 10.0으로 출력되게 하기
//	   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
//	   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
//	   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
//	   3.7  ch변수의 유니코드 출력하기
//	   3.8  ch변수에 1을 더해 L 이 출력되게 하시오
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K';
	 // 3.1
        System.out.println(iNum1 / iNum2);
        // 3.2
        double result = iNum2 * dNum;
        System.out.println(result);
        // 3.3
        System.out.println((double)iNum1);
        // 3.4
        System.out.println((double)iNum1 / iNum2);
        // 3.5
        System.out.println((int)(iNum1 / fNum));
        // 3.6
        System.out.printf("%.13f\n", iNum1 / fNum);
        // 3.7
        System.out.println((int)ch);
        // 3.8
        System.out.println((char)(ch + 1));
		
		
		
	}

}
