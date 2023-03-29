package interface_abstractclass;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class InterfaceGraphic implements ActionListener {
	
	static JButton b1, b2;
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 450);
		f.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(28, 170, 331, 214);
		f.getContentPane().add(textArea);
		
		b1 = new JButton("나를 눌러요");
		b1.setBackground(new Color(211, 211, 211));
		b1.setFont(new Font("나눔고딕", Font.BOLD, 15));
		b1.setBounds(90, 30, 212, 50);
		f.getContentPane().add(b1);
		
		b2 = new JButton("나도 눌러요");
		b2.setBackground(new Color(211, 211, 211));
		b2.setFont(new Font("나눔고딕", Font.BOLD, 15));
		b2.setBounds(90, 95, 212, 50);
		f.getContentPane().add(b2);
		
		InterfaceGraphic act = new InterfaceGraphic();
		b1.addActionListener(act);
		b2.addActionListener(act);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {	// getSource : 주소 가져옴
			//System.out.println("b1 클릭");
			textArea.append("b1 클릭함\n");
		} else {
			textArea.append("b2 클릭함\n");			
			//System.out.println("b2 클릭");
		}
	}
}
