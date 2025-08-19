package _01_calendar;

import java.time.LocalDate;

public class T04_LocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		//getter 메소드 사용
		System.out.println(today.getYear() + "년");
		System.out.println(today.getMonth() + "월");
		System.out.println(today.getMonthValue() + "월");
		System.out.println(today.getDayOfMonth() + "일");
		System.out.println("365일 중 " + today.getDayOfYear() + "일");
		System.out.println(today.getDayOfWeek() + " : yo일");
		System.out.println(today.getDayOfWeek().getValue());
		System.out.println("이 달은 총 " + today.lengthOfMonth() + "일");
		System.out.println("올 해는 총 " + today.lengthOfYear() + "일");
		
		
		
		
		
	}

}
