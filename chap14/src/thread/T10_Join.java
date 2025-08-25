package thread;

import java.security.PublicKey;

class SumThread extends Thread{
//	private int 
	int getSum(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public void run() {
		for(int i=1;i<1000;i++) {
			
		}
		System.out.println("종료");
	}
}
public class T10_Join {

	public static void main(String[] args) {
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		System.out.println("1 ~ 1000 까지의 합 : " + sumT.getSum());
		
	}

}
