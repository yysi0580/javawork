package _05_TreeSet;

//BookRun.java
public class BookRun {
 public static void main(String[] args) {
     LibraryController controller = new LibraryController(new Member("홍길동", 30, "남"));

     // 회원 정보 출력
     controller.info();

     // 책 추가(3권 기본 추가)
     controller.insertBook();

     // 추가 도서 직접 삽입
     controller.insertBook(new Book("클린 코드", "로버트 C. 마틴", "인사이트"));

     // 모든 책 목록 출력
     System.out.println("=== 도서 목록 ===");
     for (Book b : controller.selectAll()) {
         System.out.println(b);
     }

     // 책 검색
     String searchTitle = "클린 코드";
     Book result = controller.searchBook(searchTitle);
     if (result != null) {
         System.out.println("\n검색된 도서: " + result);
     } else {
         System.out.println("\n검색한 도서가 없습니다.");
     }
 }
}
