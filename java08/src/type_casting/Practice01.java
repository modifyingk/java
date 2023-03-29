package type_casting;

import java.util.ArrayList;

public class Practice01 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);	// Object <--자동형변환-- Integer <--오토박싱-- int
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		System.out.println(me.size());
		System.out.println(me);
		// 주소 대신 값이 출력 -> toString이 ArrayList 클래스에 오버라이드되어있음
		
		int money = (int)me.get(0) + 2000;
		// int <--오토언박싱-- Integer <--강제형변환-- Object
		System.out.println(money);

		double height = (double)me.get(1) + 10;
		System.out.println(height);

		boolean breakfast = (boolean)me.get(2);
		if (breakfast) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}

		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1, 3");
		} else if (gender == '여') {
			System.out.println("주민번호는 2, 4");
		} else {
			System.out.println("성별 다시 확인");
		}
	}

}
