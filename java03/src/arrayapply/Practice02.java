package arrayapply;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] last = new String[3];
		String[] now = new String[3];
		
		System.out.println("작년에 가고 싶었던 곳 3곳을 우선순위에 따라 입력해주세요.");
		for (int i = 0; i < last.length; i++) {
			last[i] = sc.next();
		}
		
		System.out.println("올해에 가고 싶은 곳 3곳을 우선순위에 따라 입력해주세요.");
		for (int i = 0; i < last.length; i++) {
			now[i] = sc.next();
		}
		
		int same = 0;
		for (int i = 0; i < last.length; i++) {
			if (last[i].equals(now[i])) {
				same++;
			}
		}
		
		System.out.println("작년과 올해 모두 제일 가고 싶은 곳은 " + same + "곳!");
		
	}

}
