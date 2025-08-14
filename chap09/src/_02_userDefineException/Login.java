package _02_userDefineException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
	private static final String ID = "admin";
	private static final String PW = "1234";
	
	public void idException(String msg) {
		
	}
	public void PWException(String msg) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("아이디를 입력해주세요 : ");
			String id = sc.next();
			System.out.println("비밀번호를 입력해주세요 : ");
			String pw = sc.next();
			login();
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			e.printStackTrace();
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능");
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}

	}
	private static void login(String id, String pw) {
		throws , {
			
		
			if(!id.equals(ID)) {
				throw ("아이디가 잘못되었습니다");
			}
			if((!pw.equals(PW)) {
				throw ion
			}
		}
	}

}
