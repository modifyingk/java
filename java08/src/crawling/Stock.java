package crawling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stock {

	static JTextArea t2;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("주식 크롤링");
		f.getContentPane().setBackground(SystemColor.inactiveCaption);
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 213, 89, 31);
		f.getContentPane().add(lblNewLabel);
		
		JTextPane t1 = new JTextPane();
		t1.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		t1.setBounds(95, 247, 205, 39);
		f.getContentPane().add(t1);
		
		t2 = new JTextArea();
		t2.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		t2.setBounds(40, 359, 307, 175);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_2 = new JButton("삼성전자");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// code를 주면서 크롤링해달라고 하기
				// crawling(code) 호출
				StockCrawling crawl = new StockCrawling();
				t2.setText(crawl.crawling("005930"));
			}
		});
		btnNewButton_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_2.setFont(new Font("나눔고딕", Font.BOLD, 16));
		btnNewButton_2.setBounds(95, 36, 205, 49);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("LG에너지솔루션");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockCrawling crawl = new StockCrawling();
				t2.setText(crawl.crawling("373220"));
			}
		});
		btnNewButton_2_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_2_1.setFont(new Font("나눔고딕", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(95, 95, 205, 49);
		f.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("SK하이닉스");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StockCrawling crawl = new StockCrawling();
				t2.setText(crawl.crawling("000660"));
			}
		});
		btnNewButton_2_2.setBackground(SystemColor.controlHighlight);
		btnNewButton_2_2.setFont(new Font("나눔고딕", Font.BOLD, 16));
		btnNewButton_2_2.setBounds(95, 154, 205, 49);
		f.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_2_1 = new JButton("크롤링 시작");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// textField(t1)에 입력한 code 가지고 오기
				String code = t1.getText();
				StockCrawling crawl = new StockCrawling();
				t2.setText(crawl.crawling(code));
			}
		});
		btnNewButton_2_2_1.setBackground(SystemColor.scrollbar);
		btnNewButton_2_2_1.setFont(new Font("나눔고딕", Font.BOLD, 16));
		btnNewButton_2_2_1.setBounds(123, 303, 149, 39);
		f.getContentPane().add(btnNewButton_2_2_1);
		f.setVisible(true);
	}
}
