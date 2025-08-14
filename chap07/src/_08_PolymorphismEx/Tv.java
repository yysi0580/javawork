package _08_PolymorphismEx;

public class Tv extends Product {
	Tv() {
		super(200);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}