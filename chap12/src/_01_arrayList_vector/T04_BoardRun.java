package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class T04_BoardRun {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		Board b1 = new Board("제목1","내용1","글쓴이1");
		list.add(b1);
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		System.out.println("총 객체 수 : " + list.size());
		Board board = list.get(1);
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		
		// 모든 객체를 하나씩 가져와서 출력하기
		for(Board b : list) {
			System.out.println(b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println("------------------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println("------------------------------------------");
		
		// 객체 삭제
		list.remove(2);
		list.remove(2);
		for(Board b : list) {
			System.out.println(b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}

}
