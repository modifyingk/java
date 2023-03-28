package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {

	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 350);
		f.getContentPane().setLayout(null);
		
		JLabel num = new JLabel("0");
		num.setHorizontalAlignment(SwingConstants.CENTER);
		num.setFont(new Font("나눔고딕", Font.BOLD, 70));
		num.setBounds(73, 71, 191, 160);
		f.getContentPane().add(num);
		
		JButton btnNewButton = new JButton("1 더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count = count + 1;
				num.setText(count + "");
			}
		});
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 13));
		btnNewButton.setBounds(73, 23, 88, 38);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0 으로 초기화");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				num.setText(count + "");
			}
		});
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 13));
		btnNewButton_1.setBounds(73, 249, 191, 38);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1 빼기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = count - 1;
				num.setText(count + "");
			}
		});
		btnNewButton_2.setBackground(SystemColor.control);
		btnNewButton_2.setFont(new Font("나눔고딕", Font.BOLD, 13));
		btnNewButton_2.setBounds(176, 23, 88, 38);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}
}
