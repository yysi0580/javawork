package thread;

class ThreadA extends Thread {
	boolean stop = false; //스레드 종료
	boolean work = true; //yield 메소드를 호출한 시점을 알기 위해
	
	@Override
	public void run(){
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 실행");
			}else {
				Thread.yield();
			}
//			stop = 0 == 0;
		}
		System.out.println("ThreadA 작업 종료");
	}
}

class ThreadB extends Thread {
	boolean stop = false; //스레드 종료
	boolean work = true; //yield 메소드를 호출한 시점을 알기 위해
	
	@Override
	public void run(){
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 실행");
			}else {
				Thread.yield();
			}
//			stop = 0 == 0;
		}
		System.out.println("ThreadB 작업 종료");
	}
}

public class T09_Yiald {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.work = false; // 계속 B만 작업
		System.out.println("A작업 일시정지------------------");
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.work = true; // 계속 A와 B 번갈아 작업
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadA.stop = true;
		threadB.stop = true;
		
		
		
	}

}
