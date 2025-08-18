package _02_stringMethod;
import java.time.LocalDate;
import java.time.ZoneId;

/*
 * substring : 문자열에서 원하는 문자열만 추출할 때 사용
 	- substring(index) : 문자열에서 index번호부터 끝까지 얻어옴
 	- substring(index,lastIndex) : 문자열에서 index번호부터 lastIndex번호 앞까지 얻어옴
 */
public class T10_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		String result = str.substring(7);
		System.out.println(result);
		
		result = str.substring(7,10);
		System.out.println(result);
		
		String sn = "970818-3124675";
		result = sn.substring(0,6);
		System.out.println(result);
		System.out.println(result);
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//int year = 2000 + (int)result.substring(0,2);
		int year;
		year = Integer.parseInt(result.substring(0,2));
		if(year <= 25)
			year += 2000;
		else
			year += 1900;
		int month = Integer.parseInt(result.substring(2,4));
		int day = Integer.parseInt(result.substring(4,6));
		System.out.println(year + "년" +  month + "월" + day + "일");
		
		
	}

}
