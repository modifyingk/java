package constructor;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Overloading {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JFrame f2 = new JFrame("나는 제목");
		
		JButton b = new JButton();
		JButton b2 = new JButton("나는 버튼");	// b2는 참조형 변수(주소)
		
		Font font = new Font("궁서", 1, 50);
		b2.setFont(font);	// font는 참조형 변수(주소), b2.setFont(주소)
		
		f2.setSize(500, 500);
		f2.add(b2);	// f2.add(주소)
		
		f2.setVisible(true);

	}

}
