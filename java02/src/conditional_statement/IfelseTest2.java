package conditional_statement;

public class IfelseTest2 {

	public static void main(String[] args) {
		int grade = 88;
		
		// 변수 선언 시 쓰레기값이 들어가지 않게 초기값을 넣어서 초기화를 해줌
		// 쓰레기값은 연산도 불가능, 출력도 불가능
		String result ="";
		
		if (grade >= 90) {
			result = "A학점";
		} else if (grade >= 85 && grade < 90) {
			result = "B+학점";
		} else if (grade >= 80 && grade < 85) {
			result = "B-학점";
		} else if (grade >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}
		System.out.println("당신의 학점은 " + result);
	}

}
