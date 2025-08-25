package thread;

class Thread4 implements Runnable {
	static long startTime;
	
	public void run() {
		
		for(int i = 0; i <500; i++) {
			System.out.printf("%s", new String("*"));
			
		}
		
		System.out.println("* 소요시간 = " + (System.currentTimeMillis() - startTime));
	}
}

public class T04_SingleThreadTime {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread4());
		th1.start();
		
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i <500; i++) {
			System.out.printf("%s", new String("*"));
			
		}
		System.out.println("* 소요시간 = " + (System.currentTimeMillis() - startTime));
		
		for(int i = 0; i <500; i++) {
			System.out.printf("%s", new String("#"));
					
		}
		System.out.println("# 소요시간 = " + (System.currentTimeMillis() - startTime));
		
		System.out.println();
		System.out.println("소요시간 = " + (System.currentTimeMillis() - startTime));
		
	}

}
