package _02_repetitive;

public class T05_break {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i = 1; 1<=100; i++) {
			sum =+ i;
			if(sum > 1000)
				break;
		}
		System.out.println(i);
		System.out.println(sum);
		for(int dan = 1; dan <= 9; dan++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n",dan, j, dan * j);

				if(dan == 5)
					break;
			}
			System.out.println();
		}
		outer: for(int dan = 1; dan <= 9; dan++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n",dan, j, dan * j);

				if(dan == 5) {
					break outer;}
			
			}
			System.out.println();
		}
		
	}
}
