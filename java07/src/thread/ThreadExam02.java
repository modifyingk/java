package thread;

public class ThreadExam02 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("@");
		}
	}
}
