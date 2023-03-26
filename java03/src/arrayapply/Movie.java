package arrayapply;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Movie {

	// 전체 영역에서 특정 변수 사용하려면 클래스 아래에 선언해야함!
	static int start = 2;	// 전역변수
	
	public static void main(String[] args) {
		// 영화제목
		String[] title = {"인생은 아름다워", "정직한 후보2", "공조2: 인터내셔날", "늑대사냥", "육사오(6/45)"};
		
		// 포스터 파일
		String[] img = {"movie1.jpg", "movie2.jpg", "movie3.jpg", "movie4.jpg", "movie5.jpg"};
		
		// 평점
		double[] grade = {8.87, 7.85, 8.03, 5.47, 8.04};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.info);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("공조2: 인터내셔날");
		top.setBounds(0, 0, 484, 72);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("나눔고딕", Font.BOLD, 35));
		f.getContentPane().add(top);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("C:\\Users\\su000\\OneDrive\\바탕 화면\\web service back-end\\Day09\\movie3.jpg"));
		center.setBounds(147, 82, 202, 324);
		f.getContentPane().add(center);
		
		JLabel bottom = new JLabel("★ 8.03");
		bottom.setBounds(0, 401, 484, 60);
		bottom.setHorizontalAlignment(SwingConstants.CENTER);
		bottom.setFont(new Font("나눔고딕", Font.BOLD, 30));
		f.getContentPane().add(bottom);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					start = start - 1;
					top.setText(title[start]);
					bottom.setText("★ " + grade[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "첫 페이지입니다.");
				}
				
			}
		});
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setBounds(0, 97, 86, 294);
		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start = start + 1;
					top.setText(title[start]);
					bottom.setText("★ " + grade[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "마지막 페이지입니다.");
				}
			}
		});
		btnNewButton_1.setBackground(SystemColor.info);
		btnNewButton_1.setBounds(398, 97, 86, 294);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}

}
