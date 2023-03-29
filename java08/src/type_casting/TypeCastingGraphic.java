package type_casting;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TypeCastingGraphic {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		
		JButton b = new JButton("나는 버튼");
		f.add(b);	// Component(부모) <-- Button(자식)
		
		JLabel l = new JLabel("나는 라벨");
		f.add(l);	// Component <-- JLabel
		
		JTextField t = new JTextField("나는 텍스트필드");
		f.add(t);	// Component <-- JTextField
		
		f.setVisible(true);
	}
	
}
