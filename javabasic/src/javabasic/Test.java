package javabasic;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		JButton btnNewButton = new JButton("왼쪽");
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("오른쪽");
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("위");
		f.getContentPane().add(btnNewButton_2, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("아래");
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
