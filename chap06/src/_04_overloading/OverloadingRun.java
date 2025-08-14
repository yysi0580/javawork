package _04_overloading;

public class OverloadingRun {
	public static void main(String[] args) {
		Overloading over = new Overloading();
		System.out.println(over.add());
		System.out.println(over.add(5));
		System.out.println(over.add(5,3));
		System.out.println(over.add(3.0,5.0));
		System.out.println(over.add("문자들"));
	}
}
