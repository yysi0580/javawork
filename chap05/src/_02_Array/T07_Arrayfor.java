package _02_Array;

public class T07_Arrayfor {

	public static void main(String[] args) {
		// 배열에서만 사용가능한 반복문
		// 전체 배열만 가능
		int num[] = {1,2,3,4,5};
		
		//for(int i = 0; i<num.length; i++) => 사용가능함
		for(int result : num) {
			System.out.println(result);
		}
		String name[] = {"홍길동","아무개","강감찬"};
		for(String result :name) {
			System.out.println(result);
		}

		String name2[] = new String[3];
		int index = 0;
		for(String str : name) {
			name2[index] = str;
			System.out.println(name2[index++]);
			name2[0] = str;
		}
		
		
		
	}

}
