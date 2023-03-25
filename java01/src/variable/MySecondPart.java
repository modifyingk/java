package variable;

import javax.swing.JOptionPane;

public class MySecondPart {

	public static void main(String[] args) {
		// 자주 쓰는 기능을 가진 부품은 대문자로 바로 쓸 수 있도록 준비되어있음
		// System, JOptionPane, 숫자로 변환해주는 부품들(Integer, Float)
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");	// 입력용 Dialog, prompt()
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요.");
		
		JOptionPane.showMessageDialog(null, "나의 이름은 " + name);	// 출력용 Dialog, alert()
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age);
		JOptionPane.showMessageDialog(null, "나의 취미는 " + hobby);
		// null 값에 값 넣어주면 그 값 위에 뜸 (ex. JFrame 위에)
		
		// 자주 안쓰는 기능을 가진 부품은 new를 가지고 새로 만들어 씀
		// JFrame, Date, ...
	}

}
