package letterlength;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class LetterLength {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(450, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Characters :");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(37, 34, 103, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Words :");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 15));
		lblNewLabel_1.setBounds(37, 67, 103, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(37, 106, 365, 254);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnNewButton.setBounds(37, 383, 116, 42);
		f.getContentPane().add(btnNewButton);
		
		JButton btnPadColor = new JButton("Pad Color");
		btnPadColor.setBackground(new Color(211, 211, 211));
		btnPadColor.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnPadColor.setBounds(162, 383, 116, 42);
		f.getContentPane().add(btnPadColor);
		
		JButton btnPadColor_1 = new JButton("Text Color");
		btnPadColor_1.setBackground(new Color(211, 211, 211));
		btnPadColor_1.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnPadColor_1.setBounds(286, 383, 116, 42);
		f.getContentPane().add(btnPadColor_1);
		f.setVisible(true);
	}
}
