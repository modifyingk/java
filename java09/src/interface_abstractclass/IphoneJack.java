package interface_abstractclass;

// 아이폰 잭의 "주요 기능을 정의"하는 역할
public interface IphoneJack {
	// 메서드로 구현해야하는 것들을 정의
	// 중간괄호 없이 불완전한 메서드 형태로 기능만을 정의한 메서드
	public abstract void makeFlat();	// -> 추상메서드
	public void make2cm();
	// 인터페이스 내에서의 메서드는 추상메서드
	// public, public abstract, abstract 생략가능
	
	// 기능 외에는 final 상수만 인터페이스에 정의 가능

}
