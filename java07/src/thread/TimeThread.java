package thread;

import java.util.Date;

public class TimeThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println(date);
			// cpu 1초 stop!
			// 자바에서 cpu를 연결
			// 자바에서 외부 자원을 연결할 때는 위험한 상황
			// 위험한 상황 (에러가 발생해서 프로그램이 멈추는 상황) 발생
			// -> 대응책 코딩 필요!
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	// 에러내용 출력해줌
			}
		}
	}
}
