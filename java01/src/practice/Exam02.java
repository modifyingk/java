package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키를 입력해주세요.");
		
		Double heightDouble = Double.parseDouble(height);
		Double result = (heightDouble - 100) * 0.9;
		
		JOptionPane.showMessageDialog(null, "당신의 적정몸무게는 " + result + "kg 입니다.");
	}

}
