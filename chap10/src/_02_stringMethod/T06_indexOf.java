package _02_stringMethod;

public class T06_indexOf {
	public static void main(String[] args) {
		/*
		 indexOf 모버로딩이 되어있음. 찾는 문자가 없으면 -1 반환, 있으면 index번호 반환
		 indexOf() : 앞에서 부터 살펴봄
		 indexOf(char) : 앞에서부터 찾아서 char의 문자의 index 번호 반환
		 indexOf(char, fronIndex)
		 indexOf()
		 indexOf()
		 */
		
		String str = "java program";
		int index = str.indexOf('a');
		System.out.println(index);
		
		index = str.indexOf('a',5);
		System.out.println(index);
		
		index = str.indexOf("va");
		System.out.println(index);
		
		index = str.indexOf("ra",5);
		System.out.println(index);
		
		if(str.indexOf("java")<0)
			System.out.println("java프로그램이 아닙니다");

		
		
	}
}
