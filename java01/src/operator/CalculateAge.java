package operator;

import javax.swing.JOptionPane;

public class CalculateAge {

	public static void main(String[] args) {
		// 입력
		String age = JOptionPane.showInputDialog("현재 나이를 입력하세요.");
		
		// 처리
		// 숫자로 변환해주는 부품 -> Integer
		int age2 = Integer.parseInt(age);
		int age3 = age2 + 1;
		
		// 출력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + age3);
	}

}
