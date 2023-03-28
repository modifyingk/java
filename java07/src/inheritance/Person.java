package inheritance;

//extends Object는 생략
// 모든 클래스는 묵시적으로 Object 클래스를 상속받음
// 모든 클래스는 8개의 메서드를 가지고 시작함
public class Person {	// 8개 메서드
	// 멤버변수 2개 추가
	String gender;
	String name;
	
	// 멤버메서드 2개 추가
	public void sleep() {
		System.out.println("zzZZZ");
	}
	public void eat() {
		System.out.println("냠냠");
	}
	
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + "]";
	}
}
