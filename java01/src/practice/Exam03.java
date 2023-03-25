package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		String telecom = JOptionPane.showInputDialog("통신사를 입력해주세요.");
		String number = JOptionPane.showInputDialog("전화번호를 입력해주세요.");
		String name = JOptionPane.showInputDialog("가입자 이름을 입력해주세요.");
		
		String result = name + "님은 " + telecom + "에 " + number;
		
		JOptionPane.showMessageDialog(null, result + "로 가입되셨습니다.");
	}

}
