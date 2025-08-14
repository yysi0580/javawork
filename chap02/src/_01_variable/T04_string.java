package _01_variable;

public class T04_string {

	public static void main(String[] args) {
		String str1 = "801호";
		String str2 = "java 풀스택";
		System.out.println(str1 + " " + str2);
		
		//escape sequence(이스케이프 문자)
		/*
		 \ + 문자 : 조합으로 특수 기능 수행
		 
		 \n : return
		 \t : tab
		 \" : 쌍따옴표 문자열 출력
		 \\ " 역슬래시 문자열 출력
		 */
		System.out.println("강의실 : 801호\n강좌명 : \"java\t풀스택\"");
		/*
		 강의실 : "801호
		 강좌명 : "java 풀스택 웹&앱 개발자"
		 
		 강의실 : "801호 \ 강좌명 : "java 풀스택 웹&앱 개발자"
		 */
		System.out.println("강의실 : \"801호\n강좌명 : \"java 풀스택 웹&앱 개발자\n");
		System.out.println("강의실 : \"801호 \\ 강좌명 : \"java 풀스택 웹&앱 개발자\"");
	}

}
