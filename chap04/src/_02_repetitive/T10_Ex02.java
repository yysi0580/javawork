package _02_repetitive;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class T10_Ex02 {

	public static void main(String[] args) {
//		1.  주사위의 숫자 맞추기 게임
//	    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
//	    사용자로 부터 숫자 입력받아서
//	    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
//	    못맞췄으면 계속 물어보기
		for(;;) {
			int rand1 = (int)Math.random() * 6 + 1;
			Scanner scan = new Scanner(System.in);
			System.out.print("주사위를 예측해주세요");
			int num = scan.nextInt();
			if(rand1 == num) {	
				System.out.print("맞았습니다");
				break;}
			else
				System.out.println("틀렸습니다.");
		}
		

	}

}
