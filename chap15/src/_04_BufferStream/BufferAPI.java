package _04_BufferStream;
/*
 * 보조 스트림 : 기반스트림만으로 부족했던 성능개선을 해주는 스트림
 			  기반스트림에서 제공하지않는 추가적인 메소드 제공(전송속도 높인다거나 등등)
 	>> 외부매체와 직접 연결되지 않음
 	   단독 사용 불가(반드시 기반스트림과 함깨 사용)
 	   
 	   
 * BufferdWriter / BufferdReader : 버퍼라는 공간을 제공해주는 보조스트림(속도 향상)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferAPI {
	// 기반 스트림 : fileWriter 사용(2byte 단위 전송)
	// 보조스트림 : BufferedWriter
	
	void fileSave() {
		// 1. 기반스트림 생성
		

//			FileWriter fw = new FileWriter("c.buffer.txt");	
		
			// 2. 보조스트림 생성
//			BufferedWriter bw = new BufferedWriter(fw);
//			BufferedWriter bw = new BufferedWriter(new FileWriter("c.buffer.txt"));
//			bw.write("안녕하세요");
//			bw.write("반갑습니다");
//			bw.write("좋은하루 되세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도 향상
			
			
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("d.buffer.txt"))){
			bw.write("안녕하세요");
			bw.write("반갑습니다");
			bw.write("좋은하루 되세요");

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try~with~resource 구문 : 자원반납을 알아서 해줌
	}
	
	
	void fileRead() {
	    try (BufferedReader br = new BufferedReader(new FileReader("d.buffer.txt"))) {
	        int data; 
	        while ((data = br.read()) != -1) { // 파일 끝에 도달하면 -1 반환
	            char ch = (char) data;          // int를 문자로 변환
	            System.out.print(ch);
	        }
	        System.out.println();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
