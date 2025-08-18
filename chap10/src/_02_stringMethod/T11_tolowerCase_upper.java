package _02_stringMethod;

import java.util.Scanner;

public class T11_tolowerCase_upper {

	public static void main(String[] args) {
		String str = "Java Program";
		
		String lower = str.toLowerCase();
		System.out.println(lower);
		System.out.println(str.toUpperCase());
		
		//사용자로부터 찾고자하는 글자를 입력받아서
		//str에 글자가 포함되어 있는지 확인(대소문자 안가림)
		//java
		//JAVA
		//jaVA
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자하는 글자 입력");
		
		String str2 = sc.next();
		System.out.println(str.toUpperCase());
		String str3 = str2.toUpperCase();
		if(lower.indexOf(str3)<0)
			System.out.println("있음");
		else
			System.out.println("없음");
		
			
	}

}
