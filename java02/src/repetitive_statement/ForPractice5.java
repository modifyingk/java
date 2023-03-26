package repetitive_statement;

public class ForPractice5 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum >= 100) {
				break;
			}
			if (i % 5 == 0) {
				continue;	// skip
			}
			sum += i;
		}
		System.out.println(sum);
	}

}