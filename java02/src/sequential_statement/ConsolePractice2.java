package sequential_statement;

import java.util.Scanner;

import javax.swing.JButton;

public class ConsolePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		int age2 = age + 1;
		
		System.out.println("내년 나이는 " + age2);
	}

}
