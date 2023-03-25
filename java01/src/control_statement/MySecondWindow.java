package control_statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class MySecondWindow {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(72, 72, 93, 30);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(178, 75, 210, 31);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(72, 138, 93, 30);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 141, 210, 31);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_2.setBounds(72, 211, 93, 30);
		f.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(178, 214, 210, 31);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 17));
		btnNewButton.setBounds(103, 307, 108, 37);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 17));
		btnNewButton_1.setBounds(252, 307, 108, 37);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
