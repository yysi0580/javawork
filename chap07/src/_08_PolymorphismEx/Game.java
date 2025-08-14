package _08_PolymorphismEx;

public class Game extends Product {
	Game() {
		super(80);
	}

	@Override
	public String toString() {
		return "Game";
	}
}