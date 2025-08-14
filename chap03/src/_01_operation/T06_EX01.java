package _01_operation;

import java.util.Scanner;

public class T06_EX01 {

	public static void main(String[] args) {
//		1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
//
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println(num1 > 0 ? "양수": "양수가 아님");
		
		
//		2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
//
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println(num2 > 0 ? "양수": num2 < 0 ? "음수" : "0");
		
//		3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
//
		System.out.print("정수를 입력하세요 : ");
		int num3 = scan.nextInt();
		System.out.println(num3 % 2 != 0 ? "홀수": "짝수");
		
//		4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
//		   사용자로부터 인원수와 사탕의 갯수를 입력받아
//		   1인당 동일하게 나눠가진 사탕 개수와
//		   나눠주고 남은 사탕 갯수를 출력하기
//
		System.out.print("인원 수를 입력하세요 : ");
		int person = scan.nextInt();
		System.out.print("사탕 수를 입력하세요 : ");
		int candy = scan.nextInt();
		System.out.printf("동일하게 나눠가진 사탕 수 : %d 남은 사탕 수 : %d\n",candy / person, candy % person);
		
//		5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하기
//		   이 때, 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력.
//			ex.
//			이름 : 이준기
//			학년(숫자만) : 2
//			반(숫자만) : 7
//			번호(숫자만) : 3
//			성별(M/F) : M
//			성적(소수점 둘째 짜리까지) : 97.35
//				
//			2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
//
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학년(숫자만) : ");
		int grade = scan.nextInt();
		System.out.print("반(숫자만) : ");
		int class1 = scan.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = scan.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("성적(소수점 둘쨰 자리까지 : ");
		float score = scan.nextFloat();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, class1, number, name, gender == 'M' ? "남학생": gender =='F' ? "여학생" : null,score );
		
//		6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
//		    14세~19세 이하이면 청소년
//		    20세 이상이면 성인으로 출력
		System.out.print("나이를 입력하시오 : ");
		int age = scan.nextInt();
		System.out.printf("당신은 %s\n",age < 0 ? "태어나지 않았습니다." :age <= 13 ?  "어린이":age < 18 ? "청소년": "성인" );
		
//		7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력.
		System.out.print("국어점수를 입력하세요");
		int kor = scan.nextInt();
		int index = 0; // 나중에  100 이상 점수가 나올 시 index++를 하여 1이상일 경우 다시 입력시키게하기
		
		System.out.print("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.print("수학점수를 입력하세요");
		int math = scan.nextInt();
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.printf("당신은 %s\n", kor <= 40 && eng <= 40 && math <= 40 && sum <= 60 ? "불합격" : "합격");
		
//		8. 주민번호를 입력받아 남자인지 여자인지 출력하기
//				
//			ex.
//			주민번호를 입력하세요(- 포함) : 123456-3123456
		System.out.print("주민번호를 입력하세요(- 포함, 띄어쓰기 미포함) : 123456-3123456");
		
		String personNumber = scan.next(); 
		char gender001 = personNumber.charAt(7);
		char chack = personNumber.charAt(6);
		System.out.println((int)gender001);
		
		System.out.printf("당신의 성별은 %s\n", chack != '-' ? null : (int)gender001 % 2 == 0 ? "여성" : "남성" );
//
//		9.  사용자로부터 두 개를 입력 받아 num1, num2에 저장하고
//		    또 다른 정수를 입력 받아 그 수가 num1 미만거나 num2 초과이면 true를 출력하고
//		    아니면 false를 출력. (단, num1은 num2보다 작아야 함)
		System.out.print("정수1을 입력하세요");
		int num01 = scan.nextInt();
		System.out.print("정수 1보다 큰 정수2를 입력하세요");
		int num02 = scan.nextInt();
		System.out.print("또다른 정수를 입력하세요");
		int triger = scan.nextInt();
		System.out.printf("%b\n", num01 > triger || num02 < triger);
		
		
		
		
//
//		10. 사용자로부터 3개의 수를 키보드로 입력 받아 
//		    입력 받은 수가 모두 같으면 true, 아니면 false를 출력
		
		System.out.print("정수를 입력하세요");
		int num001 = scan.nextInt();
		System.out.print("정수를 입력하세요");
		int num002 = scan.nextInt();
		System.out.print("정수를 입력하세요");
		int num003 = scan.nextInt();
		System.out.printf("%b\n", num001 == num002 && num002 == num003);
	}

}
