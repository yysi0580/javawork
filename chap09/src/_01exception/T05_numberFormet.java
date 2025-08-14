package _01exception;

public class T05_numberFormet {
	
	public static void main(String[] args) {
		String[] str = {"23", "17", "a", "3.141592"};
		int i = 0;
		try {
			for(i = 0;i<str.length;i++) {
				int num = Integer.parseInt(str[i]);
				System.out.println(num);
				}
		}
		catch(NumberFormatException e) {
			System.out.println(str[i] + "정수로 변환 불가");
			System.out.println(e);
			
		}
	}
		
}

