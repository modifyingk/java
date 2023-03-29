package type_casting;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import java.awt.Color;

public class SignalLamp {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.getContentPane().setLayout(new FlowLayout());
		
		JButton red = new JButton("           빨강 신호            ");
		red.setBackground(new Color(240, 128, 128));
		JButton yellow = new JButton("           노랑 신호           ");
		yellow.setBackground(new Color(240, 230, 140));
		JButton green = new JButton("           파랑 신호           ");
		green.setBackground(new Color(154, 205, 50));
		
		f.getContentPane().add(red);
		f.getContentPane().add(yellow);
		f.getContentPane().add(green);
		
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("red.png");
				JLabel label = new JLabel();
				label.setIcon(icon);
				f.getContentPane().add(label);
				f.setVisible(true);
			}
		});
		
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("yellow.png");
				JLabel label = new JLabel();
				label.setIcon(icon);
				f.getContentPane().add(label);
				f.setVisible(true);
			}
		});
		
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("green.png");
				JLabel label = new JLabel();
				label.setIcon(icon);
				f.getContentPane().add(label);
				f.setVisible(true);
			}
		});
		
		f.setVisible(true);
	}

}
