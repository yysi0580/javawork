package _04_HashMap;

import java.util.*;

public class T02_HashMap {

	public static void main(String[] args) {
	/*
	 	HashMap 생성하여, 3개 넣기
	 	Map<String, String>
	 		   id	  pw
	 	1. 사용자로부터 id pw를 입력받아서
	 		- id가 없으면 : '입력한 id는 없습니다.' 출력 후 다시 실행
	 		- pw가 없으면 : 'pw가 맞지 않습니다' 출력 후 다시실행
	 		- id와 pw가 맞으면 : '로그인 되었습니다' 출력 후 종료
	 */
		Map<String,String> map = new HashMap<>();
		
		map.put("0000", "qwer");
		map.put("dsl", "qwek");
		map.put("홍길동", "ncklew");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
            System.out.print("아이디 입력: ");
            String inputId = scanner.nextLine();

            if (!map.containsKey(inputId)) {
                System.out.println("입력한 id는 없습니다.");
                continue;
            }

            System.out.print("비밀번호 입력: ");
            String inputPw = scanner.nextLine();

            String correctPw = map.get(inputId);
            if (!correctPw.equals(inputPw)) {
                System.out.println("pw가 맞지 않습니다");
                continue;
            }

            System.out.println("로그인 되었습니다");
            break;
        }
		
		
	}

}
