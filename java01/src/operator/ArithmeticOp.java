package operator;

public class ArithmeticOp {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		System.out.println("더한 값은 " + (x + y));		// 소괄호 필수 ! 
		System.out.println("뺀 값은 " + (x - y));		// 소괄호 필수 ! 
		System.out.println("곱한 값은 " + (x * y));		// 소괄호 없어도 되지만 있는게 좋음
		System.out.println("나눈 값은 " + (x / y));		// 소괄호 없어도 되지만 있는게 좋음
		System.out.println("나눈 나머지는 " + (x % y));	// 소괄호 없어도 되지만 있는게 좋음
	}

}
