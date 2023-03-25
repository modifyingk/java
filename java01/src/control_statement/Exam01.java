package control_statement;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam01 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.scrollbar);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\문서\\java-workspace\\java01\\calculator.png"));
		btnNewButton.setBounds(0, 0, 484, 191);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 22));
		lblNewLabel.setBounds(86, 233, 87, 37);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(193, 230, 216, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 22));
		lblNewLabel_1.setBounds(86, 298, 87, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(193, 295, 216, 40);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더하기 결과!");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				// JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.gray);
				t1.setForeground(Color.white);
			}
		});
		plus.setBackground(SystemColor.scrollbar);
		plus.setFont(new Font("나눔고딕", Font.BOLD, 25));
		plus.setBounds(86, 372, 72, 40);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "빼기 결과!");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 - n22);
			}
		});
		minus.setFont(new Font("나눔고딕", Font.BOLD, 25));
		minus.setBackground(SystemColor.scrollbar);
		minus.setBounds(169, 372, 72, 40);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 결과!");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 * n22);
			}
		});
		mul.setFont(new Font("나눔고딕", Font.BOLD, 25));
		mul.setBackground(SystemColor.scrollbar);
		mul.setBounds(253, 372, 72, 40);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 결과!");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 / n22);
			}
		});
		div.setFont(new Font("나눔고딕", Font.BOLD, 25));
		div.setBackground(SystemColor.scrollbar);
		div.setBounds(337, 372, 72, 40);
		f.getContentPane().add(div);
		f.setVisible(true);
	}
}
