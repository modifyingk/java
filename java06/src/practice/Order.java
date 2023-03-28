package practice;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order {
	static int count;
	static final int PRICE1 = 6000;
	static final int PRICE2 = 5000;
	static final int PRICE3 = 4000;
	
	static int champong;
	static int chajang;
	static int udong;
	
	static int price;
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("주문 화면");
		f.getContentPane().setBackground(new Color(255, 239, 213));
		f.setSize(700, 650);
		f.getContentPane().setLayout(null);
		
		JButton img = new JButton("");
		// Label에 이미지를 변경하고 싶으면, 이미지 부품을 만들고 라벨에 아이콘을 setting
		ImageIcon image = new ImageIcon("chajang.jpg");
		img.setIcon(image);
		img.setBounds(87, 116, 500, 334);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액 : ");
		result.setFont(new Font("나눔고딕", Font.BOLD, 20));
		result.setBounds(87, 520, 294, 50);
		f.getContentPane().add(result);
		
		JLabel lblNewLabel_1 = new JLabel("개수 :");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel_1.setBounds(381, 41, 65, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		JTextPane t1 = new JTextPane();
		t1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		t1.setBounds(440, 41, 147, 47);
		f.getContentPane().add(t1);
		
		JLabel lblNewLabel = new JLabel("주문내역 :");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(87, 476, 76, 26);
		f.getContentPane().add(lblNewLabel);
		
		JTextPane t2 = new JTextPane();
		t2.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		t2.setBounds(186, 470, 401, 32);
		f.getContentPane().add(t2);
		f.setVisible(true);
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 count에 하나 플러스
				count++;
				// 짬뽕 개수
				champong++;
				// 현재 주문량을 변경
				t1.setText(count + "개");
				// 이미지 변경
				ImageIcon image = new ImageIcon("champong.jpg");
				img.setIcon(image);
				price = champong * PRICE1 + udong * PRICE2 + chajang * PRICE3;
				// 결제금액 변경
				result.setText("결제금액 : " + price + "원");
				t2.setText("짬뽕 " + champong + "개, 우동 " + udong + "개, 짜장 " + chajang +"개");
			}
		});
		b1.setBackground(SystemColor.control);
		b1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b1.setBounds(87, 41, 76, 47);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				udong++;
				t1.setText(count + "개");
				ImageIcon image = new ImageIcon("udong.jpg");
				img.setIcon(image);
				//result.setText("결제금액 : " + count * PRICE2 + "원");
				price = champong * PRICE1 + udong * PRICE2 + chajang * PRICE3;
				result.setText("결제금액 : " + price + "원");
				t2.setText("짬뽕 " + champong + "개, 우동 " + udong + "개, 짜장 " + chajang +"개");
			}
		});
		b2.setBackground(SystemColor.control);
		b2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b2.setBounds(171, 41, 76, 47);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("짜장");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				chajang++;
				t1.setText(count + "개");
				ImageIcon image = new ImageIcon("chajang.jpg");
				img.setIcon(image);
				result.setText("결제금액 : " + count * PRICE3 + "원");
				price = champong * PRICE1 + udong * PRICE2 + chajang * PRICE3;
				result.setText("결제금액 : " + price + "원");
				t2.setText("짬뽕 " + champong + "개, 우동 " + udong + "개, 짜장 " + chajang +"개");
			}
		});
		b3.setBackground(SystemColor.control);
		b3.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b3.setBounds(256, 41, 76, 47);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("결제하기");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, (champong * PRICE1 + udong * PRICE2 + chajang * PRICE3) + "원이 결제됩니다.");
			}
		});
		b4.setFont(new Font("나눔고딕", Font.BOLD, 18));
		b4.setBackground(SystemColor.control);
		b4.setBounds(450, 525, 137, 40);
		f.getContentPane().add(b4);
		
	}
}
