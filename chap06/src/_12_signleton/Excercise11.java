package _12_signleton;

import java.util.Arrays;

public class Excercise11 {

	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}
}
class Math{
	
	int max(int num[]) {
		int high = num[0];
		for(int i = 0;i < (num.length);i++) {
			if(high < num[i])
				high = num[i];
		}

		return high;
	}
	int min(int num[]) {
		int low = num[0];
		for(int i = 0;i < (num.length);i++) {
			if((low > num[i]))
				low = num[i];
		}
		return low;
	}
}


