package _02_fileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 바이트 스트림
 	- 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(좁은 통로임. 1바이트면 한글은 깨짐)
 	- 기반 스트림 :  외부 매체와 직접적으로 연결되는 통로
 	xxxInputStream : xxx 매체로부터 데이터를 입력받는 통로(외부매체로 부터 데이터를 읽어오겠다)
 	xxxOutputStream : xxx 매체로 데이터를 출력하는 통로(외부매체로 데이터를 내보내겠다. 쓰겠다)
 	
 * 순서 
   1. 스트림 생성(통로 만들기)
   2. 스트림으로 데이터 출려(메소드 활용)
   3. 다 사용한 후 스트림 반납
   
 */
public class ByteStreamAPI {
	public ByteStreamAPI(String string) {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {
	// FIleOutputStream : 파일과 직접 연결하여 1바이트 단위로 출려(쓰기)하는 스트림
		
		//1. 스트림 생성(통로 만들기)
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a_byte.txt");// 파일이 없으면 새로 만들고 통로 연결/ 파일이 있으면 통로 연결
		
			//2. 스트림으로 데이터 출려(메소드 활용)
			fout.write(97);
			fout.write('b');
		
			byte[] arr = {99,100,101};
			fout.write(arr);
			fout.write(arr, 1, 2);
			//fout.write('랑'); 2바이트라 깨져서 들어감
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void fileRead() {
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("a_byte.txt");// 파일이 없으면 새로 만들고 통로 연결/ 파일이 있으면 통로 연결
		
			//2. 스트림으로 데이터 출려(메소드 활용)

			System.out.println(fin.read());
			byte[] arr = {99,100,101};

			//fout.write('랑'); 2바이트라 깨져서 들어감
		int value = 0;
		while((value = fin.read()) != -1) {
			
		}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}