package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class CafeKiosk extends JFrame {

	JLabel day, time, adver;
	static CafeKiosk f;
	CounterThread count;
	DateThread date;
	AdvThread ad;
	
	public CafeKiosk() {
		getContentPane().setBackground(new Color(255, 248, 220));
		setSize(400, 600);
		getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Cafe");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("나눔고딕", Font.BOLD, 25));
		label1.setBounds(147, 24, 81, 40);
		getContentPane().add(label1);
		
		day = new JLabel("");
		day.setHorizontalAlignment(SwingConstants.CENTER);
		day.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		day.setBounds(23, 517, 227, 29);
		getContentPane().add(day);
		
		time = new JLabel("60초");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		time.setBounds(315, 10, 57, 29);
		getContentPane().add(time);
		
		adver = new JLabel("");
		adver.setHorizontalAlignment(SwingConstants.CENTER);
		adver.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		adver.setBounds(12, 10, 57, 29);
		getContentPane().add(adver);
		
		JButton bt1 = new JButton("");
		bt1.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\espresso.jpg"));
		bt1.setBackground(SystemColor.menu);
		bt1.setBounds(34, 83, 89, 93);
		getContentPane().add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\americano.jpg"));
		bt2.setBackground(SystemColor.menu);
		bt2.setBounds(147, 83, 89, 93);
		getContentPane().add(bt2);
		
		JButton bt3 = new JButton("");
		bt3.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\cafelatte.jpg"));
		bt3.setBackground(SystemColor.menu);
		bt3.setBounds(262, 83, 89, 93);
		getContentPane().add(bt3);
		
		JButton bt4 = new JButton("");
		bt4.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\vanilla.jpg"));
		bt4.setBackground(SystemColor.menu);
		bt4.setBounds(34, 225, 89, 93);
		getContentPane().add(bt4);
		
		JButton bt5 = new JButton("");
		bt5.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\strawberry.jpg"));
		bt5.setBackground(SystemColor.menu);
		bt5.setBounds(147, 225, 89, 93);
		getContentPane().add(bt5);
		
		JButton bt6 = new JButton("");
		bt6.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day13\\jamong.jpg"));
		bt6.setBackground(SystemColor.menu);
		bt6.setBounds(262, 225, 89, 93);
		getContentPane().add(bt6);
		
		JLabel name1 = new JLabel("에스프레소");
		name1.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		name1.setHorizontalAlignment(SwingConstants.CENTER);
		name1.setBounds(34, 180, 89, 35);
		getContentPane().add(name1);
		
		JLabel name2 = new JLabel("아메리카노");
		name2.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		name2.setHorizontalAlignment(SwingConstants.CENTER);
		name2.setBounds(147, 180, 89, 35);
		getContentPane().add(name2);
		
		JLabel name3 = new JLabel("카페라떼");
		name3.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		name3.setHorizontalAlignment(SwingConstants.CENTER);
		name3.setBounds(262, 180, 89, 35);
		getContentPane().add(name3);
		
		JLabel name4 = new JLabel("바닐라라떼");
		name4.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		name4.setHorizontalAlignment(SwingConstants.CENTER);
		name4.setBounds(34, 323, 89, 35);
		getContentPane().add(name4);
		
		JLabel name5 = new JLabel("딸기라떼");
		name5.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		name5.setHorizontalAlignment(SwingConstants.CENTER);
		name5.setBounds(147, 323, 89, 35);
		getContentPane().add(name5);
		
		JLabel name6 = new JLabel("자몽에이드");
		name6.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		name6.setHorizontalAlignment(SwingConstants.CENTER);
		name6.setBounds(262, 323, 89, 35);
		getContentPane().add(name6);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(34, 393, 317, 109);
		getContentPane().add(textPane);
		
		JLabel label2 = new JLabel("주문내역");
		label2.setFont(new Font("나눔고딕", Font.BOLD, 13));
		label2.setBounds(34, 368, 57, 15);
		getContentPane().add(label2);
		
		JButton btn = new JButton("주문하기");
		btn.setBackground(SystemColor.menu);
		btn.setFont(new Font("나눔고딕", Font.PLAIN, 13));
		btn.setBounds(262, 517, 89, 29);
		getContentPane().add(btn);
		
		setVisible(true);
		
		count = new CounterThread();
		date = new DateThread();
		ad = new AdvThread();
		
		count.start();
		date.start();
		ad.start();
	}

	public static void main(String[] args) {
		f = new CafeKiosk();

	}

	public class CounterThread extends Thread {

		@Override // @ : annotation(어노테이션) -> 표시라는 의미. 없어도 됨
		public void run() {
			for (int i = 60; i >= 0; i--) {
				time.setText(i + "초");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if (i == 0) {
					JOptionPane.showMessageDialog(f, "메인화면으로 돌아갑니다");
				}
			}

		}
	}
	
	public class DateThread extends Thread {

		@Override // @ : annotation(어노테이션) -> 표시라는 의미. 없어도 됨
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date d = new Date();
				day.setText("" + d);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	public class AdvThread extends Thread {
		@Override // @ : annotation(어노테이션) -> 표시라는 의미. 없어도 됨
		public void run() {
			String[] s = {"광고1", "광고2", "광고3", "광고4", "광고5"};
			for (int i = 0; i < s.length; i++) {
				adver.setText(s[i]);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
