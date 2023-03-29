package interface_abstractclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("button1 클릭");
	}

}
