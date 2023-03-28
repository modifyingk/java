package thread;

public class ThreadExamMain {

	public static void main(String[] args) {
		ThreadExam01 t1 = new ThreadExam01();
		ThreadExam02 t2 = new ThreadExam02();
		ThreadExam03 t3 = new ThreadExam03();
		
		t1.start();
		t2.start();
		t3.start();		
	}

}
