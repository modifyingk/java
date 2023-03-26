package arrayapply;

public class Practice3_3 {

	public static void main(String[] args) {
		String s = " 011-245-1234 ";
		String s2 = s.trim();	// 양 옆에 있는 공백 제거! (가운데는 제거x)

		String first = s2.substring(0, 3);
		
		if (first.equals("011")) {
			System.out.println("SK");
		} else if (first.equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		String[] s3 = s2.split("-");
		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		if ((s2.length()) - 2 >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
