package inheritanceapply;

import javax.swing.JOptionPane;

// 자식클래스   extends 부모글래스
public class CounterThread extends Thread {
	
	@Override	// @ : annotation(어노테이션) -> 표시라는 의미. 없어도 됨
	public void run() {
		for (int i = 20; i >= 0; i--) {
			System.out.println("카운트 >> " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실 부탁드립니다.");
			}
		}
		
	}
}
