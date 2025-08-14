package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_etcArray {

	public static void main(String[] args) {
		char chArr[] = {'a', 'b', 'c'};
		String strArr[] = {"홍길동","한빛나","!@#"};
		boolean bArr[] = {true,false,false,true};
		double dArr[] = {};
		
		Scanner scan = new Scanner(System.in);
		//문자열 3개를 넣을 수 있는 배열을 만들어 사용자로 부터 입력받아 넣기
		//1번째 이름 입력 :
		//2번째 이름 입력 :
		String name[] = new String[3];
		for(int i = 0;i < name.length;i++) {
			System.out.print((i+1)+"번째 이름 입력 :");
			name[i] = scan.next();
		}
		for(int i = 0;i < name.length;i++) {
			System.out.printf("첫 번째 이름 : %s\n",name[i]);
		}
		System.out.println(Arrays.toString(name));
		
		System.out.println(chArr);
	}
}
