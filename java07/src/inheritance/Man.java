package inheritance;

public class Man extends Person {
	// 멤버변수 몇 개? 2개
	int size;
	
	// 멤버메서드 몇 개? 10개
	public void run() {
		System.out.println("빠르게 달리다");
	}

	@Override
	public String toString() {
		return "Man [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}

}
