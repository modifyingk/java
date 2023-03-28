package make_class;

public class Bricks {
	// 하드웨어(물건) 개념
	// 속성(성질) == property, attribute
	// 기능(동작) == function, 함수
	// 틀을 만들기위해서는 물건들이 가지는 공통된 속성, 동작을 정의
	
	// 속성 -> x, y (멤버변수)
	public int x;
	public int y;
	
	// 동작 -> 쌓다 (동사형태, 멤버메서드)
	// public : 접근 제어자. 아무 package나 다 접근 가능
	public void stack () {
		System.out.println("□□□□□□");
	}
}
