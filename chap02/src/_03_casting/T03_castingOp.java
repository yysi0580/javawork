package _03_casting;

import java.util.Random;

public class T03_castingOp {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		
		int result2 = b1 + b2;
		
		char c1 = 'A';
		//char c2 = c1 + 5; 오류
		int int3 = c1 + 5;
		char c3 = (char)int3;
		System.out.println(c3);
		System.out.println((char)int3);
		
		int num1 = 100;
		int num2 = 3;
		System.out.println(num1 / num2);
		
		double bou1 = 3;
		System.out.println(num1 / bou1); // 자동 형 변환
		
		int aa = (int)(num1 / bou1);
		
		
Random random = new Random();
		
		int num123 = random.nextInt(214748364);
		System.out.println(num123);
		byte b3 = (byte)num123;
		char ch2 = (char)num123;
		System.out.println(ch2);
		System.out.println(b1);
		Long long1 = 555555320923432423L;
		float float1 = long1;
		System.out.println(float1);
		String binary = Integer.toBinaryString(num123);
		System.out.println(binary);
		String binary2 = Integer.toBinaryString(b3);
		System.out.println(binary2);
		int num234 = 51648;
		char ch1 = (char)num234;
		System.out.println(ch1);

	}

}
