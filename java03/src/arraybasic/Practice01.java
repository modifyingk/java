package arraybasic;

public class Practice01 {

	public static void main(String[] args) {
		// 1.
		int[] s = new int[5];
		
		// 2.
		System.out.println("배열의 크기는 " + s.length);
		
		// 3.
		s[0] = 100;
		System.out.println("배열 첫번째 위치의 값은 " + s[0]);
		
		// 4.
		s[s.length - 1] = 500;
		System.out.println("배열 마지막 위치의 값은 " + s[s.length - 1]);

		// 5.
		s[2] = 200;
		System.out.println("배열 세번째 위치의 값은 " + s[2]);

		// 6.
		System.out.println("---------------------");
		System.out.println("배열의 전체 데이터");
		
		for (int x : s) {
			System.out.println(x);
		}
		
		// 7.
		System.out.println("---------------------");
		System.out.println("배열의 전체 데이터 & 인덱스");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println((i + 1) + ". " + s[i]);
		}
		
	}

}
