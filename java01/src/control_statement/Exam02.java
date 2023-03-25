package control_statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam02 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 250, 205));
		f.setSize(500, 550);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 17));
		lblNewLabel.setBounds(55, 47, 133, 36);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(217, 47, 199, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("커피")) {
					JOptionPane.showMessageDialog(f, "카페 가자!");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 먹자~");
				}
			}
		});
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 17));
		btnNewButton.setBounds(55, 104, 361, 42);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 17));
		lblNewLabel_1.setBounds(55, 168, 133, 36);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(217, 168, 199, 36);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_1 = new JButton("내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int s22 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "내년에 당신은 " + (s22 + 1) + "살");
			}
		});
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 17));
		btnNewButton_1.setBounds(55, 227, 361, 42);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("나눔고딕", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(55, 291, 133, 36);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(217, 291, 199, 36);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_2 = new JLabel("수학 점수");
		lblNewLabel_1_2.setFont(new Font("나눔고딕", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(55, 351, 133, 36);
		f.getContentPane().add(lblNewLabel_1_2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(217, 351, 199, 36);
		f.getContentPane().add(t4);
		
		JButton btnNewButton_1_1 = new JButton("두 과목 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				int s33 = Integer.parseInt(s3);
				int s44 = Integer.parseInt(s4);
				double avg = (double)(s33 + s44) / 2;
				JOptionPane.showMessageDialog(f, "두 과목의 평균은 " + avg + "점!");
			}
		});
		btnNewButton_1_1.setBackground(SystemColor.menu);
		btnNewButton_1_1.setFont(new Font("나눔고딕", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(55, 410, 361, 42);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);

	}

}
