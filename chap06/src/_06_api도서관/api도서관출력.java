package _06_api도서관;

import java.util.Scanner;

public class api도서관출력 {
String title = "";
String author = "";
String prise= "";
	static String book(String title,String author,String prise) {//static을 붙이지 않으면 같은 클래스라도 호출해야함
		System.out.println( "제목 : " + title + "\n저자 : " + author + "\n가격 : " + prise);
		return "제목 : " + title + "\n저자 : " + author + "\n가격 : " + prise;	
		}
	public static void main(String[] args) {
		book("퀀텀라이프","하킴 올루세이","20,000원");

	}

}
/*public class Book {
    // 속성 (필드)
    private String title;
    private String author;
    private int price;

    // 제목을 넣는 메서드 (setter)
    public void setTitle(String title) {
        this.title = title;
    }

    // 저자를 넣는 메서드 (setter)
    public void setAuthor(String author) {
        this.author = author;
    }

    // 가격을 넣는 메서드 (setter)
    public void setPrice(int price) {
        this.price = price;
    }

    // 책 정보 출력 메서드
    public void printInfo() {
        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
    }

    // main 메서드: 실행용
    public static void main(String[] args) {
        Book myBook = new Book();  // 객체 생성

        myBook.setTitle("자바 프로그래밍");  // 제목 넣기
        myBook.setAuthor("홍길동");         // 저자 넣기
        myBook.setPrice(30000);              // 가격 넣기

        myBook.printInfo();                  // 책 정보 출력
    }
}*/ //gpt님님님의 답변