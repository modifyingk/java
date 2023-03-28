package constructor;

public class Account {
	// 멤버변수, class 아래에 선언(class 전체에서 사용 가능, 전역변수)
	// 글로벌변수(global)
	String name;	// 사람이름
	String ssn;		// 주민번호
	int money;		// 돈

	// 메서드 이름을 클래스이름과 동일하게 void를 안씀
	// new 객체 생성 시 입력값을 자동초기화
	// 객체생성할 때 필요한 값을 한정시킬 수 있음
	// 생성자 메서드 (메서드 생략해서 생성자(constructor라고 부름)
	public Account(String name, String ssn, int money) {
		this.name = name;
		// 통장 클래스 바로 아래 멤버변수(this가 클래스를 의미) = 파라메터
		this.ssn = ssn;
		this.money = money;
	}
	// Source -> Generate Constructor using Fields 클릭하면 자동 생성!
}
