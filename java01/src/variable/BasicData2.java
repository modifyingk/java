package variable;

public class BasicData2 {

	public static void main(String[] args) {
		// 정수 -> ex) 나이, 지갑, 금액, 우주
		byte age = 100; // -128~127(1바이트)
		short wallet = 20000; // 2바이트
		int money = 500000000;	// 21억(4바이트)
		long space = 10000000000L;	// 21억이상(8바이트) -> 숫자만 써놓으면 int로 인식 -> L(소문자도 가능)붙여야함
		
		// 실수 -> ex) 몸무게, 키
		double height = 165.5;	// 8바이트
		float weight = 88.8f;	// 숫자만 써놓으면 double로 인식 -> f(대문자도 가능)붙여야함
		
		// 문자 -> 1개 ''(2바이트)
		char gender = '남';
		
		// 논리 -> true/false
		boolean todayFinished = false;
		
		// 특별한 부품, 기본형은 아님 -> String : 문자열
		String name = "홍길동";
		System.out.println("내 이름은 " + name);
	}

}
