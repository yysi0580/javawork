package _02_Array;

import java.util.Arrays;

public class T03_Ex01 {

	public static void main(String[] args) {
		//1. 총점, 평균 구하기
		int score[] = {100, 98, 69, 79, 82};
		int sum = 0;
		for(int i = 0;i < (score.length);i++) {
			sum = score[i];
			
		}
		double avg = (double)sum / score.length;
		System.out.printf("%.2f\t%d\n",avg,sum)
		;
		//2. 최대값, 최소값 구하기
		int num[] = {27,89,92,16,9,109,29,3,32,45};
		int high = num[0]; 
		int low = num[0];
		for(int i = 0;i < (num.length);i++) {
			if(high < num[i])
				high = num[i];
			if((low > num[i]))
				low = num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println(high);
		System.out.println(low);
		//정수형 배열 10개를 만들어 랜덤함수를 이용하여 값 넣기
		int int1[] = new int[10];
		for(int i = 0;i < (int1.length);i++) {
			int1[i] = (int)(Math.random() * 100);
			
		}
		System.out.println(Arrays.toString(int1));
		
		int k = 3;
		
		
		
		
	}

}
