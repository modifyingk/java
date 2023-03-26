package repetitive_statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Exam02_2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("K-pop 인기투표");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel.setBounds(150, 24, 187, 58);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. 아이유 - 라일락");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(257, 130, 187, 34);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0 표");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(279, 174, 56, 58);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("2. 프로미스나인 - we go");
		lblNewLabel_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(257, 305, 187, 34);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("0 표");
		lblNewLabel_2_1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(279, 349, 56, 58);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3. 스테이씨 - ASAP");
		lblNewLabel_1_2.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(257, 485, 187, 34);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("0 표");
		lblNewLabel_2_2.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(279, 529, 56, 58);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day07\\lilac.jpeg"));
		btnNewButton.setBounds(61, 113, 153, 147);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day07\\wego.jpeg"));
		btnNewButton_1.setBounds(61, 285, 153, 147);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day07\\asap.jpeg"));
		btnNewButton_2.setBounds(61, 461, 153, 147);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
