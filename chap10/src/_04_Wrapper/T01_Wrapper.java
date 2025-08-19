package _04_Wrapper;

public class T01_Wrapper {

	public static void main(String[] args) {
		Integer i1 = new Integer(3);
		
		Integer i2 = Integer.valueOf(3);
		
		Integer i3 = null;
		
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i3.toString()); //NullPointerException

		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MAX_VALUE);
		System.out.println("SIZE : " + Integer.SIZE + "bit");
		System.out.println("BYTES : " + Integer.BYTES + "Bytes");
		System.out.println("TYPE : " + Integer.TYPE);
		
		
		
		
	}

}
