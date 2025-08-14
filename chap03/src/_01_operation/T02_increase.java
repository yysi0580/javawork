package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ 1 증가
		int num1 = 10;
		num1 ++;
		System.out.println(num1);
		
		num1 = 10;
		num1 --; // num1 --> 9
		num1 --; // num1 --> 8
		num1 ++; // num1 --> 9
		System.out.println(num1);
		
		
		//단할 일 떄는 연산자가 앞에 붙으나 뒤에 붙으나 동일한 결과
		num1 = 10;
		++num1; // == num1++
		
		//연산시
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + num3++; // 11 + 10 result == 21
		
		// 앞에 붙으면 면저 증가시키고 연산을 하고,
		// 뒤에 붙으면 연산먼저 하고 다음에  나 자신을 증가 시킨다
		System.out.println(result);
		System.out.println(num2);
		System.out.println(num3);
		
		
		num2 = num3 = 10;
		result =num2-- + ++num3;
		System.out.println(result);
		
		
	}

}
