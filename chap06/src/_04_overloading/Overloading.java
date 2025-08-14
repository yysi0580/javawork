package _04_overloading;

public class Overloading {
	//오버로딩의 조건
	//메서드의 이름이 같아야 한다
	//매개변수의 개수가 다른건지 자료형이 달라야 한다
	int num1 = 10;
	
	int add() {
        return 0;
    }
	int add(int num1) {
		return num1;
	}
	int add(int num1,int num2) {
		return num1 + num2;
	}
	double add(double num1, double num2) {
		return num1 + num2;
	}
	String add(String name) {
		return "이름 : " + name;
	}
}
