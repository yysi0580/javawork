package _06_constructor;

class ThisConOver {
	int num;
	double dou;
	String name;
	
	ThisConOver(){
		this(1, 1.0,"홍길동");
		System.out.println("매개변수가 없는 생성자");
	}
	ThisConOver(int num){
		this(num, 1.0,"홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	ThisConOver(String name){
		this(1, 1.0,name);
		System.out.println("매개변수가 1개인 생성자(String)");
	}
	ThisConOver(int num,double dou){
		this(num, dou,"홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	ThisConOver(int num,double dou,String name){
		System.out.println("매개변수가 3개인 생성자");
		this.num = num;
		this.dou = dou;
		this.name = name;
	}	
	void info() {
		System.out.println("int : " + num);
		System.out.println("double : " + dou);
		System.out.println("String : " + name);
	}
}

public class ConOverloadingRun {

	public static void main(String[] args) {
		ThisConOver co = new ThisConOver();
		co.info();
		co = new ThisConOver(10);
		System.out.println("--------------------");
		co.info();
		
		co = new ThisConOver("더조은");
		System.out.println("--------------------");
		co.info();
		
		co = new ThisConOver(100, 3.14);
		System.out.println("--------------------");
		co.info();
		
		co = new ThisConOver(100, 3.14,"더조은");
		System.out.println("--------------------");
		co.info();
		
	}

}
