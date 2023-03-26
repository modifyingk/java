package arrayapply;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("숫자 입력 >> ");
			array[i] = sc.nextInt();
		}
		int result = array[0] + array[2];
		System.out.println(result);
		
		System.out.println("---------------");
		
		// 2.
		String[] array2 = new String[3];
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print("글자 입력 >> ");
			array2[i] = sc.next();
		}
		String result2 = array2[0] + "보다는 " + array2[1];
		System.out.println(result2);
	}

}
