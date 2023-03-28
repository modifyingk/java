package staticVariable;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int docount;
	
	// 객체 생성 시, 3개 데이터 반드시 넣어서 객체생성
	public Day(String doing, int time, String location) {
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		docount = docount + time;
	}
	
	// 일반 메서드는 객체 생성 후, 주소로 접근해서 호출해야함 !
	// 일반 메서드는 객체 생성 후, 호출(사용)할 수 있음
	// 평균을 객체 생성과 상관없이 아무때나 구하고 싶음
	// -> 객체 생성과 상관없이 기능을 정의하고 싶음 -> static으로!
	public static double getAvg() {
		// static 메서드 안에 들어가는 전역변수는 객체를 생성하지 않아도
		// 접근가능해야하므로 static변수만 가능
		return docount / (double)count;
	}
		
	// 객체 생성 후, 생성된 객체의 주소가 가리키는 인스턴스 변수의 값들을 String으로 만들어줌
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
}
