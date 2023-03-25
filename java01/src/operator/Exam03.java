package operator;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// 5.
		final double PI = 3.14;
		String radius = JOptionPane.showInputDialog("반지름을 입력해주세요.");
		double r = Double.parseDouble(radius);
		
		double area = PI * r * r;
		System.out.println("원의 면적은 " + area);
	}

}
