package _03_casting;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1;
		
		int int1 = b1;
		int1 = s1;
		
		char ch1 ='김';
		int intch = ch1;
		System.out.println(intch);
		System.out.println(ch1);
		
		double d1 = int1;
		System.out.println(d1);
		
		int int2 = s1 + 1;
		
		int int3 = ch1 + 1;
		
		int int1000 = 12398748;
		int1000 = b1;
		System.out.println(int1000);
	}
	

}
