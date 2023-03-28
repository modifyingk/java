package constructor;

public class Mask {
	// 멤버변수(역할), 전역변수(범위), 인스턴스변수(객체 생성 후 실제)
	String color;	// 참조형변수(저장타입)
	int price;		// 기본형변수
	int count;		// 기본형변수
	// 멤버변수는 전역변수, 전역변수는 자동초기화가 됨
	// 멤버변수의 원본은 클래스원본영역에 저장
	// 멤버변수는 객체 생성될 때, 힙영역에 복사가 됨
	
	// 객체 생성 후, 멤버변수 값을 나중에 넣어도 상관없는 경우
	// 생성자를 만들어주지 않아도 됨
	
	// 생성자가 하나도 없는 경우!!! 자동으로 입력값 없는 생성자를 만들어줌 
	// -> 묵시적으로 생성자가 만들어짐
	// -> 기본생성자(default constructor)
//	public Mask() {
//
//	}
	// 다른 생성자가 있는 경우는 기본생성자 안만들어줌 !!
	
	// 객체 생성 시, 멤버변수 값을 바로 넣는 경우,
	// 넣을 데이터를 파라메터로 해서 생성자를 반드시 만들어줌
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
}
