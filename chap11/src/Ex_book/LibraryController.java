package Ex_book;

import java.util.*;

import java.util.ArrayList;

class LibraryController {
    private ArrayList<Book> list;

    public LibraryController() {
        list = new ArrayList<>();
        // 책 3권 명시적 추가
        list.add(new Book("Java Programming", "홍길동", "IT출판사", 25000));
        list.add(new Book("SQL Basics", "김철수", "DB출판사", 18000));
        list.add(new Book("Spring Framework", "이영희", "IT출판사", 30000));
    }

    public void insertBook(Book book) {
        list.add(book);
    }

    public ArrayList<Book> selectList() {
        return list;
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : list) {
            if (book.getTitle().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book deleteBook(String title, String author) {
        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                list.remove(i);
                return book;
            }
        }
        return null;
    }

    public int ascBook() {
        list.sort(null);  // Book 클래스의 compareTo에 의해 정렬
        return 1;
    }
}
