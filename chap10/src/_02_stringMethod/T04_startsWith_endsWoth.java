package _02_stringMethod;

public class T04_startsWith_endsWoth {

	public static void main(String[] args) {
		// StartsWith : 맨 앞에 지정하는 문자로  시작하는지
		String str = "springjavahtmlsql";
		str.startsWith("string");
		boolean result = str.startsWith("sj");
		System.out.println(result);
		
		//endsWith : 맨 끝에 지정하는 문자로 끝나는지
		String[] strArr = {"aa.jpg", "bb.class", "cc.text","dd.jpg"};
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].endsWith("jpg")|| strArr[i].endsWith("png")) {
				System.out.println(strArr[i] + "는 그림파일입니다");
			}
				
				
		}
		
	}

}
