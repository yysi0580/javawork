package _01_object;

//실행용 클래스
public class T01_mainClass {

	public static void main(String[] args) {
		// 라이브러리(API) 사용하기
		// 클래스이름 변수명 = new 클래스이름();
		T01_apiClass ob1 = new T01_apiClass();
		System.out.println(ob1.name);
		System.out.println(ob1.num);
		System.out.println(ob1.bool);
		
		ob1.name = "더빛나";
		System.out.println("첫번째 객체의 이름 : " + ob1.name);
		
		T01_apiClass ob2 = new T01_apiClass();
		System.out.println("두번째 객체의 이름 : " + ob2.name);
		
		T02_apiClass api1 = new T02_apiClass();
		System.out.println();
		
		api1.address = "서울 서초구";
		System.out.println("(1번째 객체) 주소 : " + api1.address);
 	}

}
