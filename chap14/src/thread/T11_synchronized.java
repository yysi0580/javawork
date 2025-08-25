package thread;

class Bank {
	private int balance = 1000;
	
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
}

public class T11_synchronized {

	public static void main(String[] args) {
		Runnable r = new ThreadSy();
		new Thread(r).start();
		new Thread(r).start();
		
		
		
		//Thread t1 = new Thread(new ThreadSy());
		
		
		/*
		 * Bank bank = new Bank();
		 * 
		 * Runnable r = new Runnable() {
		 * 
		 * @Override public void run() { new Thread(r).start(); } };
		 */
	}

}
class ThreadSy implements Runnable{
	Bank bank = new Bank();

	@Override
	public void run() {
		while (bank.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			bank.withdraw(money);
			System.out.println("잔액 : " + bank.getBalance());
		}
	}
}