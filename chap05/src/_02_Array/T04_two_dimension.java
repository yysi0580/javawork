package _02_Array;

public class T04_two_dimension {

	public static void main(String[] args) {
		int[][] score = {{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15}};
		System.out.println(score[1][2]);
		System.out.println(score[2][1]);
		
		System.out.println("score의 길이(행길이) : " + score.length);
		System.out.println("score[0]의 길이(열길이) : " + score[0].length);
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++)
				System.out.print(score[i][j]  + " ");
			System.out.println();
		}
		System.out.println();
		int iArr[][] =new int[4][3];
		int count = 3;
		for(int i=0;  i<iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] =  count;
				count += 3;
				System.out.print(iArr[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println();
		int iArr2[][] = {{1,2,3},{4,5},{6,7,8,9,10}};
		for(int i=0;  i<iArr2.length; i++) {
			for(int j = 0; j < iArr2[i].length; j++) {
				iArr2[i][j] =  count;
				count += 3;
				System.out.print(iArr2[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
