package conditional_statement;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터 과목 점수 : ");
		int grade = sc.nextInt();
		String result = "";
		
		if (grade >= 90) {
			result = "A학점";
		} else if (grade >=80) {
			result = "B학점";
		} else if (grade > 70) {
			result = "C학점";
		} else if (grade > 60) {
			result = "D학점";
		} else {
			result = "F학점";
		}
		
		System.out.println(result);

	}

}
