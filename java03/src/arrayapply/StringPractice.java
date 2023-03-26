package arrayapply;

public class StringPractice {

	public static void main(String[] args) {
		// String sn = "931212-1035715";
		String s = "나는 프로그래머야";
		String s2 = "진짜 !";
		
		System.out.println(s + s2);	// String이면 +는 산술연산자가 아니라 결합연산자!
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		System.out.println(s.endsWith("야"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		System.out.println(s.contains(s2));
		System.out.println(s.lastIndexOf("프"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
	}

}
