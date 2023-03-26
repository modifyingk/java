package arrayapply;

import java.util.Random;

public class ProblemCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[990];
		int[] mine = new int[990];
		
		Random r = new Random();
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = r.nextInt(4) + 1;
			mine[i] = r.nextInt(4) + 1;
		}
		
		int score = 0;
		
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == mine[i]) {
				score++;
			}
		}
		
		System.out.println("점수 : " + score + " / " + answer.length);
	}

}
