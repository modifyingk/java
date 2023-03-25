package variable;

public class BasicData {

	public static void main(String[] args) {
		// 기본데이터 : 정수, 실수, 문자, 논리
		// ram에 넣어보기
		int age = 23;	// 정수 (4)
		double height = 161.1;	// 실수 (8)
		char gender = '여';	// 문자 1개 : ''(작은 따옴표) (2)
		boolean lunch = true;	// 논리 -> true(1), false(0) (1)
		
		System.out.println("내 나이는 " + age + "살");
		System.out.println("내 키는 " + height + "cm");
		System.out.println("내 성별은 " + gender);
		System.out.println("내가 점심을 먹었는지 여부는 " + lunch);
		
		String name = "홍길동";
		System.out.println("내 이름은 " + name);
	}

}
