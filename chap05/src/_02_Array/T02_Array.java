package _02_Array;

public class T02_Array {

	public static void main(String[] args) {
		/*
		 배열
		 	1.공간을 만들 때  여러개를 넣을 수 있음
		 	3. 다차원 가능
		 	
		 */
		//저장공간만 확보하고 값은 나중에 넣을 때
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[10];
		
		//배열을 만들면서 값을 바로 넣을 떄
		int[] arrayInt3 = {1,2,3,4,5};
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[3]);
		
		arrayInt3[4] = 10;
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[1]);
		System.out.println(arrayInt3[2]);
		System.out.println(arrayInt3[3]);
		System.out.println(arrayInt3[4]);
		System.out.println("-------------------------");
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(arrayInt[i]);
		}
		
		/*arrayInt3[0] = 1;
		arrayInt3[1] = 3;
		arrayInt3[2] = 5;
		arrayInt3[3] = 7;
		arrayInt3[4] = 9;*/
		System.out.println("-------------------------");
		
		int count = 0;
		for(int i = 0; i<5; i++) {
			count += 2;
			System.out.println(arrayInt3[i]);
		}	
		int int1[] = {1,2,3,4,5,6,7,8,9};
		int int2[] = new int[10];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("-------------------------");
		
		for(int i = 0; i<int1.length;i++) {
			System.out.println(int1[i]);
			
		
		}
		//문
		/*
		 for문으로 값 0,3,6,9,12 넣기
		 값의 합계를 구하여 출력하기
		 */
		int[] int3 = new int[5];
		for(int i = 0;i > int1.length;i++) {
			int3[i] = i*3;
		}
		int sum = 0;
		for(int i = 0;i > int3.length;i++) {
			sum = int3[i];
		}
		int[] int4 = new int[5];
		
		System.out.println("합계 : " + sum);
		for(int i = 0;i > int4.length;i++) {
			int4[i] = i*3;
			sum = int4[i];
		}
		System.out.println("합계 : " + sum);
		
	}
}
