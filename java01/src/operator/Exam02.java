package operator;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// 4.
		String pe = JOptionPane.showInputDialog("체육 점수를 입력해주세요.");
		String math = JOptionPane.showInputDialog("수학 점수를 입력해주세요.");
		String eng = JOptionPane.showInputDialog("영어 점수를 입력해주세요.");
		String kor = JOptionPane.showInputDialog("국어 점수를 입력해주세요.");
		
		int pe2 = Integer.parseInt(pe);		
		int math2 = Integer.parseInt(math);		
		int eng2 = Integer.parseInt(eng);		
		int kor2 = Integer.parseInt(kor);		
		
		double avg = (double)(pe2 + math2 + eng2 + kor2) / 4;
		System.out.println("1학기 성적 평균은 " + avg);
	}

}
