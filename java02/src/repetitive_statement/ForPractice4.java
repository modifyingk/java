package repetitive_statement;

public class ForPractice4 {

	public static void main(String[] args) {
		// 1.
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 2.
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		// 3.
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 += i;
		}
		System.out.println(sum3);
	}

}
