package thread;

public class SameTimeThread {

	public static void main(String[] args) {
		// 1s = 1000ms
		CounterThread t1 = new CounterThread();
		TimeThread t2 = new TimeThread();
		ArrayThread t3 = new ArrayThread();
		
		// cpu에 동시에 처리되도록 등록
		t1.start();
		t2.start();
		t3.start();
	}

}
