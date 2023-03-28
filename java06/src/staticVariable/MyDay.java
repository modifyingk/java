package staticVariable;

public class MyDay {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호안에서만 사용 가능
		// day1, day2, day3 변수는 메서드 안에서만 쓸 수 있음
		// main 안에서만 쓸 수 있는 지역변수(local 변수)
		// 지역변수 <-> 전역변수
		// 지역변수는 자동초기화 X -> 프로그래머가 직접 초기화
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1);
		System.out.println(Day.count);
		// 클래스 이름으로 접근 가능 -> static
		System.out.println("전체 하는 일의 시간 : " + Day.docount + "시간");
		System.out.println();

		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2);
		System.out.println(Day.count);
		System.out.println("전체 하는 일의 시간 : " + Day.docount + "시간");
		System.out.println();
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println("전체 하는 일의 시간 : " + Day.docount + "시간");
		System.out.println("-----------------------------------------");
		
		System.out.println("평균 하는 일의 시간 : " + Day.getAvg());
		
	}

}
