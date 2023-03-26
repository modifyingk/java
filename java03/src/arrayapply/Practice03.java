package arrayapply;

public class Practice03 {

	public static void main(String[] args) {
		String num = "011-245-1234";
		String n = num.trim();	// 양 옆에 있는 공백 제거! (가운데는 제거x)		
		
		String first = num.substring(0, 3);
		String second = num.substring(4, 8);
		
		if (first.equals("011")) {
			System.out.println("SK");
		} else if (first.equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		if (second.endsWith("-")) {
			System.out.println("올드폰");
		} else {
			System.out.println("최신폰");
		}
		
		if ((num.length()) - 2 >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
