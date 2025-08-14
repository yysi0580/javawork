package _01exception;

public class T03_nullPointer {

	public static void main(String[] args) {
		String data = null;
		/*
		 * 참조변수를 출력하면
		   - toString()호출 -> 패키지이름.클래스명@주소
		 * 참조변수에 null 들어 있으면 toString()호출하지 않음. 그냥 null 나옴
		 */
		/*System.out.println(data); 
		 System.our.println(data.toString());
		 */
		try {
			System.out.println(data.toString());
		}catch (NullPointerException e) {
			System.out.println("데이터가 들어있지 않습니다.");
			System.out.println("예외 : " + e);
		}

	}

}
