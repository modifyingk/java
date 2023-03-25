package control_statement;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyFirstWindow {
	private static JTextField textField;

	public static void main(String[] args) {
		// 1. Jframe 부품을 새로 생성
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부품의 크기 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\문서\\java-workspace\\java01\\mail.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		// 3. 새로 만든 부품 보여주기 설정
		f.setVisible(true);
	}

}
