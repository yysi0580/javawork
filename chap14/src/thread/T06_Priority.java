package thread;
class Thread5 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("%");
			for(int j=0;j<100000000;j++);
					
		}
		System.out.println();
		System.out.println("t4-End");
	}
}
class Thread6 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("%");
			for(int j=0;j<100000000;j++);
		}
		System.out.println();
		System.out.println("t5-End");
	}
}
public class T06_Priority {

	public static void main(String[] args) {
		Thread t4 = new Thread5();
		Thread t5 = new Thread6();
		t4.setPriority(1);
		t5.setPriority(10);
		System.out.println("t5-의 우선순위 : " + t5.getPriority());

		System.out.println("t4-의 우선순위 : " + t4.getPriority());
		t4.start();
		t5.start();
		
	}

}
