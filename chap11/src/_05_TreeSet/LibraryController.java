package _05_TreeSet;

import java.util.ArrayList;

// LibraryController.java
public class LibraryController {
    private Member member;
    private ArrayList<Book> aList = new ArrayList<>();

    public LibraryController(Member member) {
        this.member = member;
    }

    public void info() {
        System.out.println(member.toString());
    }

    public void insertBook() {
        aList.add(new Book("홍길동전", "허균", "조선출판사"));
        aList.add(new Book("자바의 정석", "남궁성", "도우출판"));
        aList.add(new Book("데이터 구조", "홍길동", "컴퓨터출판"));
    }

    public void insertBook(Book book) {
        aList.add(book);
    }

    public ArrayList<Book> selectAll() {
        return aList;
    }

    public Book searchBook(String bookTitle) {
        Book book = null;
        for (Book b : aList) {
            if (b.getTitle().equals(bookTitle)) {
                book = b;
                break;
            }
        }
        return book;
    }
}
