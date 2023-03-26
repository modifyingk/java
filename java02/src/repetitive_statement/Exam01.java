package repetitive_statement;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int front = 0;
		int back = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 숫자 입력 >> ");
			int n1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 >> ");
			int n2 = sc.nextInt();
			
			if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				front++;
			} else if (n1 < n2) {
				System.out.println("뒷 숫자가 더 큽니다.");
				back++;
			} else {
				System.out.println("두 숫자가 동일합니다.");
			}
			
			System.out.print("계속할까요? 계속(o) 종료(x)) >> ");
			String end = sc.next();
			char end2 = end.charAt(0);
			if (end2 == 'x') {
				System.out.println("앞 숫자가 더 큰 횟수 : " + front);
				System.out.println("뒷 숫자가 더 큰 횟수 : " + back);
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
			}
		}
	}

}
