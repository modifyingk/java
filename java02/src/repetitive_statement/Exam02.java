package repetitive_statement;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int js = 0;
		int bts = 0;
		int voteNum = 0;
		
		while(true) {
			System.out.print("입력 (1)아이유 (2)유재석 (3)방탄 >> ");
			int vote = sc.nextInt();
			
			switch (vote) {
			case 1:
				iu++;
				voteNum++;
				break;
			case 2:
				js++;
				voteNum++;
				break;
			case 3:
				bts++;
				voteNum++;
				break;
			}
			
			if (voteNum == 10) {
				break;
			}
		}
		System.out.println("아이유 : " + iu);
		System.out.println("유재석 : " + js);
		System.out.println("방탄 : " + bts);
	}

}
