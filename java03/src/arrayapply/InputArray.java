package arrayapply;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력 >> ");
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int x : num) {
			System.out.println(x);
			sum = sum + x;
		}
		
		System.out.println(sum);
		System.out.println(sum / 5.0);
	}

}
