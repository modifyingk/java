package interface_abstractclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button2 클릭");
	}

}
