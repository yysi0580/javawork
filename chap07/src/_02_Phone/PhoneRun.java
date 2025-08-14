package _02_Phone;

public class PhoneRun {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("z플립","검정");
//		SmartPhone sp2 = new Smartphone("폴드z","흰색");
		System.out.println("모델명 : "+ sp.model);
		System.out.println("tortkd : "+ sp.color);
		
		sp.bell();
		sp.hangUp();
		sp.sendVoice("여보세요 누구십니까?");
		sp.receveVoice("나는 더조은입니다. 좋은 하루되세요");
		sp.hangOut();
		
	}

}
