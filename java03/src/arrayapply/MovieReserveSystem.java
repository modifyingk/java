package arrayapply;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieReserveSystem {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550, 750);
		
		// 레이아웃 부품 지정
		// 왼쪽부터 하나씩 순서대로 배치해주는 부품 -> FlowLayout
		FlowLayout flow =new FlowLayout();
		f.setLayout(flow);
		
		/*
		JButton b1 = new JButton("좌석1");
		JButton b2 = new JButton("좌석2");
		JButton b3 = new JButton("좌석3");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		*/
		
		int[] seat = new int[500];	// {0, 0, 0, 0, 0, 0, ...}
		
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton((i + 1) +"");
			f.add(b);
			b.setBackground(Color.white);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();	// 버튼 위 글자 값 가져옴
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false);
					b.setBackground(Color.lightGray);
					int index = Integer.parseInt(s);
					seat[index] = 1;	// 예약완료! -> {1, 1, 0, 0, ...}
					
					int count = 0;
					int price = 13000;
					// 예약 수  확인
					for (int j : seat) {
						if (j == 1) {
							count++;
						}
					}
					
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");
					
					// 한 자리 당 금액 13000원, 결제금액 출력
					JOptionPane.showMessageDialog(f, "결제금액은 " + price * count + "원입니다.");
				}
			});
		}
		f.setVisible(true);
		// setVisible 위에 있는 것을 보여줌
		// setVisible 아래에 쓴 코드는 안보임!
	}

}
