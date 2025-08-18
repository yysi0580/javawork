package _03_stringBuffer;
/*
 * String(불변성) : 한번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
 					변하지 않는 문자열을 사용할 때 
	
 * StringBuffer : 추가, 삭제, 수정가능, 동기화 지원
 * 					자주 변경되는 문자열을 사용할 때
 * 					멀티스레스 환경에서 사용
 * 
 * StringBuilder : 추가, 삭제, 수정가능, 동기화 지원 안함
 * 					자주 변경되는 문자열을 사용할 때
 * 					단일스레드 환경에서 사용
 					StringBuffer 보다 빠르자
 */
public class T01_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();// 16문자를 담을 수 있는 객체 생성
		StringBuffer sb2 = new StringBuffer(30);	//30문자를 담을 수 있는 객체 생성
		StringBuffer sb3 = new StringBuffer("abc");	//'abc'의 값이 들어있는 객체 생성 
		
		System.out.println("sb1에 담겨있는 문자열의 길이 : " + sb1.length());
		System.out.println("sb2에 담겨있는 문자열의 길이 : " + sb2.length());
		System.out.println("sb3에 담겨있는 문자열의 길이 : " + sb3.length());
		
		StringBuffer sb4 = new StringBuffer("abc");	//'abc'의 값이 들어있는 객체 생성 
		System.out.println("sb3 == sb4 : " + (sb3 == sb4));
		System.out.println("sb3.equals(sb4) : 주소가 같은가? : " + sb3.equals(sb4));
		System.out.println("-----------------------------");
		
		// ToString()은 오버라이딩 되어 있음(값으로 들어있는 문자열 반환)
		System.out.println("sb3 : " + sb3);
		sb3.append("def");
		System.out.println("sb3 : " + sb3);
		sb3.append(123);
		System.out.println("sb3 : " + sb3);
		sb3.append(true);
		System.out.println("sb3 : " + sb3);
		System.out.println("-----------------------------");
		
		// delete()
		sb3.deleteCharAt(8);
		System.out.println("sb3 : " + sb3);
		sb3.delete(3,6);
		System.out.println("sb3 : " + sb3);
		sb3.delete(3,sb3.length());
		System.out.println("sb3 : " + sb3);
		System.out.println("-----------------------------");
		
		//insert(index, 문자열)
		sb3.insert(1, "123");
		System.out.println("sb3 : " + sb3);
		sb3.insert(4, "김");
		System.out.println("sb3 : " + sb3);
		System.out.println("-----------------------------");
		
		//replace(indexstart, indexend,문자열)
		sb3.replace(1, 4, "b");
//		sb3.replace(1, 4, "program");
		System.out.println("sb3 : " + sb3);
		System.out.println("-----------------------------");
		
		//reverse() : 뒤부터 거꾸로
		System.out.println("거꾸로 출력 : " + sb3.reverse());
		System.out.println("-----------------------------");
		
		// capacity() : StringBuffer의 객체가 생성되 때 버퍼의 크기
		//				기본 버퍼크기 16문자 + 문자크기
		System.out.println("sb1의 버퍼 크기 : " + sb1.capacity());
		System.out.println("sb2의 버퍼 크기 : " + sb2.capacity());
		System.out.println("sb3의 버퍼 크기 : " + sb3.capacity());
		
		
		
		
		
		
		
	}

}
