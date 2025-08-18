package _03_stringBuffer;

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
		
		// 가장 가까운 정수로 반환(반올림) : rint()
		System.out.println("13.1의 가까운 정수 : " + Math.rint(13.1));
		System.out.println("13.1의 가까운 정수 : " + Math.rint(13.5));
		System.out.println("13.1의 가까운 정수 : " + Math.rint(-13.5));
		System.out.println("------------------------------------");
		
		// 소수점 이하 반올림(가장 가까운 정수로) : round
		System.out.println("13.1의 가까운 정수 : " + Math.round(13.1));
		System.out.println("13.1의 가까운 정수 : " + Math.round(13.5));
		System.out.println("13.1의 가까운 정수 : " + Math.round(-13.5));
		
	}

}
