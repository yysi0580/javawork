package _04_overloading;

public class OverOp {
	//-, *, /
	int num1 = 1;
	//매개변수 - 없는거, 1개, 2개
	
	
	int minus() {
		return num1;
    }
	int minus(int num1) {
		return num1;
	}
	double minus(double num1, double num2) {
		return num1 - num2;
	}
	int minus(int num1,int num2) {
		return num1 - num2;
	}
	int multiply() {
		return num1;
    }
	int multiply(int num1) {
		return num1;
	}
	double multiply(double num1, double num2) {
		return num1 * num2;
	}
	int multiply(int num1,int num2) {
		return num1 * num2;
	}
	int divide() {
		return num1;
    }
	int divide(int num1) {
		return num1;
	}
	int divide(int num1,int num2) {
		return num1 / num2;
	}
	
	double divide(double num1, double num2) {
		return num1 / num2;
	}
	int remainder(int num1,int num2) {
		return num1 % num2;
	}
	
	
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