package _02_stringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		// split : 문자열을 기준 문자열로 분리하여 배열로 만듬
		String str = "더조은-홍길동-이순신-아무개";
		String[] name = str.split("-");
		System.out.println(name.length);
		System.out.println(Arrays.toString(name));
		str = "더조은-홍길동/이순신,아무개@서민구";
		
		name = str.split("[!@#$%^&*()-=/,_]");
		System.out.println(Arrays.toString(name));
		str = "더조은-홍길동-이순신-아무개";
		name = str.split("-",3);
		System.out.println(Arrays.toString(name));
		System.out.println(name[2]);
	}

}
