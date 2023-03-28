package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Cafe {

	public Cafe () {
		
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 248, 220));
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cafe");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel.setBounds(147, 24, 81, 40);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Today");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(23, 517, 227, 29);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("60초");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(315, 10, 57, 29);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\espresso.jpg"));
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setBounds(34, 83, 89, 93);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\americano.jpg"));
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(147, 83, 89, 93);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\cafelatte.jpg"));
		btnNewButton_2.setBackground(SystemColor.menu);
		btnNewButton_2.setBounds(262, 83, 89, 93);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\vanilla.jpg"));
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.setBounds(34, 225, 89, 93);
		f.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\strawberry.jpg"));
		btnNewButton_4.setBackground(SystemColor.menu);
		btnNewButton_4.setBounds(147, 225, 89, 93);
		f.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\jamong.jpg"));
		btnNewButton_5.setBackground(SystemColor.menu);
		btnNewButton_5.setBounds(262, 225, 89, 93);
		f.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("에스프레소");
		lblNewLabel_3.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(34, 180, 89, 35);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("아메리카노");
		lblNewLabel_3_1.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(147, 180, 89, 35);
		f.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("카페라떼");
		lblNewLabel_3_2.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(262, 180, 89, 35);
		f.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("바닐라라떼");
		lblNewLabel_3_3.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(34, 323, 89, 35);
		f.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("딸기라떼");
		lblNewLabel_3_4.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setBounds(147, 323, 89, 35);
		f.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("자몽에이드");
		lblNewLabel_3_5.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setBounds(262, 323, 89, 35);
		f.getContentPane().add(lblNewLabel_3_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(34, 393, 317, 109);
		f.getContentPane().add(textPane);
		
		JLabel lblNewLabel_4 = new JLabel("주문내역");
		lblNewLabel_4.setFont(new Font("나눔고딕", Font.BOLD, 13));
		lblNewLabel_4.setBounds(34, 368, 57, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_6 = new JButton("주문하기");
		btnNewButton_6.setBackground(SystemColor.menu);
		btnNewButton_6.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		btnNewButton_6.setBounds(262, 517, 89, 29);
		f.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("60초");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(12, 10, 57, 29);
		f.getContentPane().add(lblNewLabel_2_1);
		f.setVisible(true);
		
	}
}
