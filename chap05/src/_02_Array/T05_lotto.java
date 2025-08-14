package _02_Array;

public class T05_lotto {

	public static void main(String[] args) {
		int lotto[][] =new int[5][7];
		int lotto2[] = new int[45];
		
		for(int i = 0 ; i<lotto.length ; i++) {
			System.out.printf("로또 %d번 줄 : ",i + 1);
			for(int j = 0 ; j<lotto[i].length ; j++) {
				lotto[i][j] = (int)((Math.random() * 45) + 1);
				System.out.print(lotto[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0 ; i<lotto2.length ; i++) {
			lotto2[i] = i + 1;
			
	}
		for(int i = 0 ; i<6 ; i++) {
			int index = (int)((Math.random() * 45) + 1);
			int temp = lotto2[i];
			lotto2[i] = i + 1;
		}
	}

}
