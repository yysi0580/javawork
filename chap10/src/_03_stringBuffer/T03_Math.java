package _03_stringBuffer;import java.awt.ContainerOrderFocusTraversalPolicy;
import java.sql.ResultSet;

public class T03_Math {

	public static void main(String[] args) {
		// 절대값 :abs()
		System.out.println("-11의 절대값 : " + Math.abs(-11));
		System.out.println("-11.45의 절대값 : " + Math.abs(-11.45));
		System.out.println("------------------------------------");
		// 소수점 이하를 큰 숫자로 올림 : cell()
		System.out.println("13.1의 올림" +  Math.ceil(13.1));
		System.out.println("-13.1의 올림" +  Math.ceil(-13.1));
		System.out.println("------------------------------------");
		
		// 소수점 이하를 작은 숫자로 내림 : floor()
		System.out.println("13.7을 내림 : " + Math.floor(13.7));
		System.out.println("13.7을 내림 : " + Math.floor(-13.7));
		System.out.println("------------------------------------");
		
		// 가장 가까운 정수로 반환 : rint()
		System.out.println("13.1의 가까운 정수 : " + Math.rint(13.1));
		System.out.println("13.1의 가까운 정수 : " + Math.rint(13.5));//14
		System.out.println("13.1의 가까운 정수 : " + Math.rint(-13.5));//-14
		System.out.println("------------------------------------");
		
		// 소수점 이하 반올림(가장 가까운 정수로) : round
		System.out.println("13.1의 반올림 : " + Math.round(13.1));
		System.out.println("13.1의 반올림 : " + Math.round(13.5));//14
		System.out.println("13.1의 반올림 : " + Math.round(-13.5));//-13
		System.out.println("------------------------------------");
		
		// 소수점 2째자리까지 반올림하여 얻기
		double value = 12.34567;
//		value * 100 = 1234.567
		double value2 = value * 100;
		double result = Math.round(value2);
		double result2 = result / 100;
		System.out.println(result2);
		System.out.printf("%.2f",result2);
		System.out.println("------------------------------------");
		
		// 두 수중 큰 수 or 작은 수 반환 : max(), min()
		System.out.println("7과 8중 큰 숫자 : " + Math.max(7,8));
		System.out.println("7과 8중 작은 숫자 : " + Math.min(7,8));
		System.out.println("7과 8중 큰 숫자 : " + Math.min(7.23,8.89));
		char ch = (char)Math.max('a', 'z');
		System.out.println(ch);
		
		// 제곱 연산
		System.out.println("5^3 : " + (int)Math.pow(5, 3));
		System.out.println("1024^5 : " + (int)Math.pow(1024, 3.05));
		
		//제곱근 : sqrt()
		System.out.println("25의 제곱근 : " + (int)Math.sqrt(1518500249));
	
		//랜덤 값 추출 : random()
		//1~100까지의 값 중 1개 추출
		int random = (int)(Math.random()*100) + 1;
		System.out.println(random);
		
		
		
		
		
		
		
	}

}
