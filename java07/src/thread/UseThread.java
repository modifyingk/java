package thread;

public class UseThread {

	public static void main(String[] args) {
		// thread 객체 생성
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		// 생성한 객체로 start() 메서드 호출
		t1.start();
		t2.start();
	}

}
