package inheritanceapply;

import java.util.Date;

public class TimeThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			Date date = new Date();
			System.out.println("시각 >> " + date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
