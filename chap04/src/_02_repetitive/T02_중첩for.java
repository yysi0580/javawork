package _02_repetitive;

public class T02_중첩for {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 6; j <= 10; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 9; i += 2) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t",i,j, i * j);
				System.out.printf("%d * %d = %d\n",i + 1 ,j  ,(i + 1) * j);
			}
			System.out.printf("\n");
		}		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t",i,j, i * j);
			}
			System.out.printf("\n");
		}		
	}
}
