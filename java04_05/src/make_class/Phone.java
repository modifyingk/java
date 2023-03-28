package make_class;

public class Phone {
	// 공통적인 성질 ex) 크기, 스피커
	// -> 변수를 사용, 2개의 변수 필요
	// -> 멤버변수	(멤버변수는 값을 넣지 않고 선언만! 자동으로 초기화시켜줌)
	public int size;	// 0으로 자동 초기화
	public String speaker;	// ""으로 자동 초기화
	// 자동초기화 시켜주는 것 : 멤버변수, 배열
	// public 안 쓰면 이 package에서만 쓸 수 있음
	// public 쓰면 아무데서나 사용 가능
	
	// 동작(기능) 정의 ex) 통화하다, 사진찍다
	// 멤버메서드(함수)
	public void call() {
		// 처리내용을 순서대로 써줌
		System.out.println("☎ 띠리링~ 여보세요");
	}
	
	public void picture() {
		System.out.println("스마일 ~ 찰칵!");
	}
}
