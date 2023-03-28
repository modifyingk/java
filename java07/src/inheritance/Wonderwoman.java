package inheritance;

public class Wonderwoman extends Woman {
	public void fight() {
		System.out.println("악당과 싸우다");
	}

	@Override
	public String toString() {
		return "Wonderwoman [gender=" + gender + ", name=" + name + "]";
	}
}
