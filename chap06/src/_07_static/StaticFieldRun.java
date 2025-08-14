package _07_static;

public class StaticFieldRun {

	public static void main(String[] args) {
		int stNum = StaticField.stNum;
		System.out.println(stNum);
		
		StaticField sf = new StaticField();
		System.out.println(sf.num);
		
		String stName = sf.stName;
		
		StaticField.stMethod();
		
	}

}
