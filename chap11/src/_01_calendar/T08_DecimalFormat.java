package _01_calendar;

import java.text.DecimalFormat;

public class T08_DecimalFormat {

	public static void main(String[] args) {
		double num1 = 1234567.89;
		double num2 = 3.0;

//		DecimalFormat df = new DecimalFormat("");
		// 0 : 무조건 자리차지
		// # : 값이 없으면 자리차지X
		System.out.println(new DecimalFormat("0").format(num1));
		System.out.println(new DecimalFormat("#").format(num1));
		
		System.out.println(new DecimalFormat("0.0").format(num2));
		System.out.println(new DecimalFormat("#.#").format(num2));
		System.out.println(new DecimalFormat("0000000000.0000").format(num1));
		System.out.println(new DecimalFormat("##########.####").format(num1));
		System.out.println("------------------------------");
		
		System.out.println(new DecimalFormat("#,###.##").format(num1));
		
		
		
		
		
		
		
		
	}

}
