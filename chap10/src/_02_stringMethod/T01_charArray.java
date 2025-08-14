package _02_stringMethod;

public class T01_charArray {

	public static void main(String[] args) {
		String str1 = new String("java program");
		String str11 = new String("java program");

		String str2 = "tjoeun";
		String str22 = "tjoeun";
		
		char[] chArr = {'컴','퓨','터'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
		
		//주민번호를 넣은 변수
		//123456-1
		
		String str = "101011-1010101";
		char[] chArr2 = str.toCharArray();
		if(1==(int)chArr2[8]%2)
			System.out.println("w");
	}

}
