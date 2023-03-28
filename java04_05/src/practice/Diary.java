package practice;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diary {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 239, 213));
		f.setTitle("Diary Login");
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 239, 213));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day10\\diary.png"));
		btnNewButton.setBounds(125, 45, 238, 187);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 17));
		lblNewLabel.setBounds(78, 286, 92, 36);
		f.getContentPane().add(lblNewLabel);
		
		JTextPane t1 = new JTextPane();
		t1.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		t1.setBounds(182, 286, 200, 36);
		f.getContentPane().add(t1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("나눔고딕", Font.BOLD, 17));
		lblPassword.setBounds(78, 353, 92, 36);
		f.getContentPane().add(lblPassword);
		
		JTextPane t2 = new JTextPane();
		t2.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		t2.setBounds(182, 353, 200, 36);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				
				// id = "root", pw = "1234"이면 로그인 -> 일기쓰기 화면 띄우기
				// 아니면 "로그인 실패"
				if (id.equals("root") && pw.equals("1234")) {
					// 일기쓰기 창 띄우기
					Write w = new Write();
					w.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패!");
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day10\\login.png"));
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnNewButton_1.setBounds(87, 445, 124, 36);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("RESET");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1, t2에 공백 넣기
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day10\\reset.png"));
		btnNewButton_1_1.setBackground(SystemColor.control);
		btnNewButton_1_1.setFont(new Font("나눔고딕", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(257, 445, 124, 36);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);
	}
}
