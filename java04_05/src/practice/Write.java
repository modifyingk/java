package practice;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Write {

	public void open () {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 239, 213));
		f.setTitle("Diary");
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Diary");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(177, 23, 121, 36);
		f.getContentPane().add(lblNewLabel);
		
		JLabel date = new JLabel("날짜");
		date.setHorizontalAlignment(SwingConstants.CENTER);
		date.setFont(new Font("나눔고딕", Font.BOLD, 17));
		date.setBounds(24, 93, 92, 36);
		f.getContentPane().add(date);
		
		JTextPane textDate = new JTextPane();
		textDate.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		textDate.setBounds(128, 93, 313, 36);
		f.getContentPane().add(textDate);
		
		JLabel title = new JLabel("제목");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("나눔고딕", Font.BOLD, 17));
		title.setBounds(24, 143, 92, 36);
		f.getContentPane().add(title);
		
		JTextPane textTitle = new JTextPane();
		textTitle.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		textTitle.setBounds(128, 143, 313, 36);
		f.getContentPane().add(textTitle);
		
		JLabel content = new JLabel("내용");
		content.setHorizontalAlignment(SwingConstants.CENTER);
		content.setFont(new Font("나눔고딕", Font.BOLD, 17));
		content.setBounds(24, 194, 92, 36);
		f.getContentPane().add(content);
		
		JTextPane textContent = new JTextPane();
		textContent.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		textContent.setBounds(128, 194, 313, 247);
		f.getContentPane().add(textContent);
		
		JButton btn = new JButton("저장");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textDate.getText();
				String s2 = textTitle.getText();
				String s3 = textContent.getText();
				
				try {
					FileWriter file = new FileWriter(s1 + ".txt");
					
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");

					file.close();
					JOptionPane.showMessageDialog(f, "저장 완료!");
					textDate.setText("");
					textTitle.setText("");
					textContent.setText("");
					
				} catch (IOException e1) {
					System.out.println("파일 저장 중 에러 발생!");
				}
			}
		});
		btn.setBackground(SystemColor.control);
		btn.setFont(new Font("나눔고딕", Font.BOLD, 17));
		btn.setBounds(53, 469, 388, 36);
		f.getContentPane().add(btn);
		
		f.setVisible(true);

	}

}
