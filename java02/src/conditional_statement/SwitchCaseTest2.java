package conditional_statement;

import java.util.Date;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Date date = new Date();	// java.sql 말고 java.util의 date 사용
		int month = date.getMonth() + 1;	// getMonth() 하면 음력이라 +1 해줘야함
		int day = date.getDay();	// 0:일요일, 1:월요일, 6:토요일
		
		switch (day) {
		case 0: case 6:
			System.out.println("놀자");
			break;

		default:
			System.out.println("자바 공부하자");
			break;
		}
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10:
			System.out.println("가을");
			break;
		case 1: case 2: case 11: case 12:
			System.out.println("겨울");
		default:
			break;
		}
	}

}
