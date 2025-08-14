package _06_Ex;

public class product_main {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.powerOn();
		tv.volumeUp(1012312);
		tv.channelUp(2);
		tv.volumeDown(10);
		tv.search("QWER 히나");
		tv.powerOff();
		
		Game game = new Game();
		
		Product.talkAI("날씨 알려줘");
		
		game.powerOn();
		game.volumeUp(112320);
		game.changeGame("ori in the");
		game.powerOff();
		Product.talkAI("오늘 일정 알려줘");
	}

}
