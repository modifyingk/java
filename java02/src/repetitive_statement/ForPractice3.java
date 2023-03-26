package repetitive_statement;

public class ForPractice3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("---------");
		
		int sum2 = 0;
		for (int i = 3; i <= 11; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
	}

}
