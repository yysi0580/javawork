class Parent {
    String name;
    boolean equals() {}
    int hashCode() {}
    String toString() {}
    }
}

class Person{
	public Person() {
		
	}
}

class Child extends Parent {
       
    
    @Override
    boolean equals(Person p) {
    	return name.equals(p.name) && age == p.age;
    }
    
    @Override
    int hashCode() {}
    @Override
    String toString() {}
    
}

public class ApiClass {
    public static void main(String[] args) {
        Child c = new Child();
        
        
    }
}