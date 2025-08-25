package Ex_book;

import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String category;
    private int price;

    // 빈 생성자
    public Book() {}

    // 모든 필드를 받는 생성자
    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    // getter / setter 메소드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString() 오버라이딩
    @Override
    public String toString() {
        return "제목 : " + title + ", 저자 : " + author + ", 출판사 : " + category;
    }

    // equals() 오버라이딩 (가격이 같으면 true)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book)obj;
            return this.price == other.price;
        }
        return false;
    }

    // hashCode() 오버라이딩 (가격으로 해시코드 생성)
    @Override
    public int hashCode() {
        return price;
    }

    // compareTo() 오버라이딩 (제목 기준 오름차순 정렬)
    @Override
    public int compareTo(Book book) {
        return this.getTitle().compareTo(book.getTitle());
    }
}