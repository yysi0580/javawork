package _01_generice;

class Box{
	Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}



	
}

class Apple{}
class Banana{}

public class T01_nonGenerice {

	public static void main(String[] args) {
		Box box = new Box();
		box .setObj("더조은");
		String name = (String)box.getObj();
		
		box.setObj(new Apple());
		Apple apple = (Apple)box.getObj();
		
		
		
	}

}
