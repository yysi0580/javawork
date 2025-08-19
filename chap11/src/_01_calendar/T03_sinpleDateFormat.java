package _01_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T03_sinpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		/*
		 * SinpleDateFormat 클래스 : 날짜에 대한 포맷을 제공
		 	- yyyy : 년도 4자리, yy : 년도, 2자리
		 	- MM : 월 2자리, M : 월 1자리
		 	- dd : 일 2자리, d : 일 1자리
		 	- hh : 시 2자리 12시간제(0~11), h : 시 1자리, HH 24시간제(0~23)
		 	- mm : 분 2자리, m : 분 1자리
		 	- ss : 초 2자리, s : 초 1자리
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/M/dd");
		System.out.println(sdf2.format(today));
		
		Date today2 = new Date(125, 3, 7);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf3.format(today2));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf4.format(today));
				
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf5.format(today));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf6.format(today));
		
		String str = "20250819";
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf8.format(today));
		try {
			Date strNow = sdf8.parse(str); // 문자를 날짜의 형태로 변경
			System.out.println(sdf8.format(strNow)); // 날짜포맷 적용
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
