package sequential_statement;

import java.util.Scanner;

public class ConsolePractice {

	public static void main(String[] args) {
		// Scanner를 새롭게 만들어서 이클립스의 콘솔뷰에서 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();	// 입력을 받음
		System.out.println("입력받은 이름은 " + name + "입니다.");

		System.out.print("소속 입력 : ");
		String com = sc.next();	// 입력을 받음
		System.out.println("입력받은 소속은 " + com + "입니다.");
	}

}