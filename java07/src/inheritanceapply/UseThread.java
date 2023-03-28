package inheritanceapply;

public class UseThread {

	public static void main(String[] args) {
		CounterThread counter = new CounterThread();
		ImageThread image = new ImageThread();
		TimeThread time = new TimeThread();
		
		counter.start();
		image.start();
		time.start();
	}

}
