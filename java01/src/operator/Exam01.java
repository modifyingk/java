package operator;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// 1.
		char pw = 'p';
		String pass = JOptionPane.showInputDialog("암호를 입력해주세요.");
		char pw2 = pass.charAt(0);
		
		if (pw == pw2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
		
		// 2.
		String chg = JOptionPane.showInputDialog("어제와 오늘의 몸무게 변화는?");
		double change = Double.parseDouble(chg);
		
		if (change > 2) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("다이어트 실패!");
		}
		
		// 3.
		if (pw == pw2 && change > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
	}

}
