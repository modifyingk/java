package arrayapply;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		Random r = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			// int는 boundary 줄일 수 있음
			// 1~45까지 나오도록 +1 해줌
		}

		for (int x : lotto) {
			System.out.print(x + " ");
		}
	}

}
