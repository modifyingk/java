package conditional_statement;

import java.util.Date;

public class Exam04 {

	public static void main(String[] args) {
		// 1.
		Date date = new Date();
		int time = date.getHours();

		if (time < 11) {
			System.out.println("Good morning!");
		} else if (time < 15) {
			System.out.println("Good afternoon!");
		} else if (time < 19) {
			System.out.println("Good evening!");
		} else {
			System.out.println("Good night~");
		}
		
		// 2.
		int month = date.getMonth() + 1;
		int d = 0;
		
		switch (month) {
		case 2:
			d = 28;
			break;
		case 4: case 6: case 7: case 11:
			d = 30;
			break;
		default:
			d = 31;
			break;
		}
		System.out.println(month + "월은 " + d + "일까지");
	}

}
