package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T06_Ex01 {

	public static void main(String[] args) {
//		1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
//		   이용하여 순서대로 넣고 출력하기
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
//		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
//		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
		System.out.println("\n-------------------");
		int arr1[] = new int[10];
		for(int i = 9; i >= 0; i--) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

//		3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
//		   1~입력받은 수를 차례대로 넣어 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 길이 입력 : ");
		int length1 = scan.nextInt();
		int arr2[] = new int[length1];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i+1;
			System.out.print(arr2[i] + " ");
		}
//		4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
//		   배열 인덱스를 이용하여 귤 출력
		String arr3[] = new String[5];
		arr3 = arr3 = new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr3[1]);
//		5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
//		   ex)
//		   문자열 : application
//		   문자 : i
//		   application에 i가 존재하는 위치(인덱스) : 4 8 
//		   i 개수 : 2
		System.out.println("문자열입력");
		String str1 = scan.next();
		char arr4[] = new char[str1.length()];
		
		System.out.println("찾을 단어 입력");
		char ch = scan.next().charAt(0);
	
		int count1 = 0;
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = str1.charAt(i);
		}
		System.out.println("문자열 : " + str1);
		System.out.println("문자 : " + ch);
		System.out.print("application에 i가 존재하는 위치(인덱스)");
		for(int i = 0; i < arr4.length; i++) {
			if(arr4[i] == ch) {
				count1++;
				System.out.print(i + " ");
			}
				
		}
		
		

		System.out.println(ch + " 개수 : " + count1);
//		6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
//		   숫자와 같은 요일 출력
//		   ex.
//		   0 ~ 6 사이 숫자 입력 : 4			
//		   금요일
//		   0 ~ 6 사이 숫자 입력 : 7
//		   잘못 입력하셨습니다.
//		char arr5[] = new char[7];
		char arr5[] = {'월','화','수','목','금','토','일'};
		System.out.print("요일을 입력하시오\n"
				+ "(월 : 1,화 : 2,수 : 3,목 : 4,금 : 5,토 : 6,일 : 7) : ");
		int int1 = scan.nextInt();
		
		if(int1 >= 0 && int1 <= 6)
			System.out.printf("%c요일\n",arr5[int1-1]);
		else
			System.out.printf("잘못 입력하셨습니다.");
		
//		7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
//		   배열 전체의 합 출력
		
		System.out.print("배열 길이 입력 : ");
		int length2 = scan.nextInt();
		int arr6[] = new int[length2];
		System.out.print("각 배열 정수 입력(구분자 띄어쓰기) : ");
		for(int i = 0; i < arr6.length; i++) {
			
			arr6[i] = scan.nextInt();
			
		}
		System.out.println(Arrays.toString(arr6));
//		8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		   다시 정수를 받도록 하세요. 

//		   ex.
//		   정수 : 4
//		   다시 입력하세요.
//		   정수 : -6
//		   다시 입력하세요.
//		   정수 : 5
//		   1, 2, 3, 2, 1
		System.out.print("3이상인 홀수 자연수를 입력하세요 : ");
		int int2 = scan.nextInt();
		
//		11. 사용자로부터 정수값 5개 배열에 입력
//		   오름차순 정렬로 정렬하기
		
		int arr10[] = new int[5];
		System.out.print("각 배열 정수 입력(구분자 띄어쓰기) : ");
		for(int i = 0; i < arr10.length; i++)
			arr10[i] = scan.nextInt();
		quickSort(arr10, 0, arr10.length-1);
		System.out.println(Arrays.toString(arr10));
		
		
		
		
		
	}
	static void quickSort(int[] arr, int l, int r) { // 11번 문제용 퀵소트
		if(l >= r) return;
		int p = arr[(l+r)/2], i = l, j = r, t;
		while(i <= j) {
			while(arr[i] < p) i++;
			while(arr[j] > p) j--;
			if(i <= j) {
				t = arr[i]; arr[i] = arr[j]; arr[j] = t;
				i++; j--;
			}
		}
		quickSort(arr, l, j);
		quickSort(arr, i, r);
    }
}
