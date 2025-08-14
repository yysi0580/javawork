package _05_varArg;

public class VarArg {

	public static void main(String[] args) {
		//VarArg v = new VarArg();
		//v.mathod("a","b","C");
		
		method("a","b","c","d","e");
		
	}

	/*void method(String s1) {
		System.out.println(s1);
	}
	void method(String s1,String s2) {
		System.out.println(s1+ " " + s2);
	}
	void method(String s1, String s2, String s3) {
		System.out.println(s1+ " " + s2 + " " + s3);
	}*/
	/*void method(String... str) { 
		for(String s : str) {
			System.out.println(s);
		}*/
	static void method(String... str) {//static을 붙이지 않으면 같은 클래스라도 호출해야함
		for(String s : str) {
			System.out.println(s);
		}
	}
}
