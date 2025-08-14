package _06_Ex;



public interface Product {
	final int MAX = 100;
	final int MIN = 0;
	void powerOn();
	void powerOff();
	void volumeUp(int amount);
	void volumeDown(int amount);
	
	static void talkAI(String massage) {
		System.out.println("AI : " + massage);
	}
	default void Search(String keyword) {
		System.out.println("검색 : " + keyword);
	}
	
	/*class tv{
		
	}
	class Game{
		
	}
	class product*/
}
