package arrayapply;

import java.util.Random;

public class ProblemCheck {

	public static void main(String[] args) {
		int[] answer = new int[990];
		int[] mine = new int[990];
		
		Random r = new Random();
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = r.nextInt(4) + 1;
			mine[i] = r.nextInt(4) + 1;
		}
		
		System.out.println("번호\t답안\t내답");
		System.out.println("-------------------");
		for (int i = 0; i < answer.length; i++) {
			System.out.println((i + 1) + "번\t" + answer[i] + "\t" + mine[i]);
		}
		
		int score = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == mine[i]) {
				score ++;
			}
		}
		System.out.println("-------------------");
		System.out.println("총 점수\t" + score + " / " + answer.length);
	}

}
