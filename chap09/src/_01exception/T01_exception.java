package _01exception;

public class T01_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(5/0);
			System.out.println(4);
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		System.out.println(4);
	}

}
