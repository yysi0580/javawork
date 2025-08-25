package Ex_book;

import java.util.*;

public class BookRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryController library = new LibraryController();
        int choice;

        do {
            System.out.println("*************** 메뉴 *************");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 전체 도서 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서명 오름차순 정렬");
            System.out.println("0. 종료");
            System.out.print("선택하세요: ");
            choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("제목 입력: ");
                    String title = sc.nextLine();
                    System.out.print("저자 입력: ");
                    String author = sc.nextLine();
                    System.out.print("출판사 입력: ");
                    String category = sc.nextLine();
                    System.out.print("가격 입력: ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    Book newBook = new Book(title, author, category, price);
                    library.insertBook(newBook);
                    System.out.println("도서가 추가되었습니다.");
                    break;

                case 2:
                    ArrayList<Book> allBooks = library.selectList();
                    if (allBooks.isEmpty()) {
                        System.out.println("등록된 도서가 없습니다.");
                    } else {
                        for (Book b : allBooks) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    System.out.print("검색어 입력: ");
                    String keyword = sc.nextLine();
                    ArrayList<Book> foundBooks = library.searchBook(keyword);
                    if (foundBooks.isEmpty()) {
                        System.out.println("검색된 도서가 없습니다.");
                    } else {
                        for (Book b : foundBooks) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4:
                    System.out.print("삭제할 도서 제목 입력: ");
                    String delTitle = sc.nextLine();
                    System.out.print("삭제할 도서 저자 입력: ");
                    String delAuthor = sc.nextLine();

                    Book removedBook = library.deleteBook(delTitle, delAuthor);
                    if (removedBook != null) {
                        System.out.println("삭제된 도서: " + removedBook);
                    } else {
                        System.out.println("해당 도서를 찾을 수 없습니다.");
                    }
                    break;

                case 5:
                    library.ascBook();
                    System.out.println("도서가 제목 기준으로 오름차순 정렬되었습니다.");
                    break;

                case 0:
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
            System.out.println();

        } while (choice != 0);

        sc.close();
    }
}
