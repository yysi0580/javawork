package _03_casting;

import java.util.Random;

public class T01_casting {

	public static void main(String[] args) {
		System.out.println("byte의 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short의 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int의 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("char의 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		System.out.println("----------------------------------");
		
		Random random = new Random();
		
		int num1 = random.nextInt();
		System.out.println();
		byte b1 = (byte)num1;
		char ch2 = (char)num1;
		System.out.println(ch2);
		System.out.println(b1);
		Long long1 = 555555320923432423L;
		float float1 =long1;
		System.out.println(float1);
		String binary = Integer.toBinaryString(num1);
		System.out.println(binary);
		String binary2 = Integer.toBinaryString(b1);
		System.out.println(binary2);
		int num2 = 51648;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
	}

}
