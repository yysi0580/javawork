package _02_stringMethod;
/*
indexOf 모버로딩이 되어있음. 찾는 문자가 없으면 -1 반환, 있으면 index번호 반환
indexOf() : 앞에서 부터 살펴봄
indexOf(char) : 앞에서부터 찾아서 char의 문자의 index 번호 반환
indexOf(char, fromIndex) : fromIndex번호부터 촘ㄱ문자를 찾아서 index 번호를 반환
indexOf(String) : 뒤에서부터 문자열의 시작 index번호 반환
indexOf(String, fromIndex) :fromIndex 번호로부터 찾아서 문장ㄹ의 시작 index번호 반환
*/
public class T07_lastIndesOf {

	public static void main(String[] args) {
		String str = "abcabcabca";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("abc"));
		
		//fromIndex는 index 앞을 보고, 문자열이 걸쳐져 있으면 그문자열도 찾는다.
		System.out.println(str.lastIndexOf("abc",6));
		System.out.println(str.lastIndexOf("abc",4));
		System.out.println(str.lastIndexOf("abc",5));
		
	}

}
