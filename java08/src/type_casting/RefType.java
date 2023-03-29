package type_casting;

import java.util.ArrayList;

import javax.swing.JButton;

public class RefType {

	public static void main(String[] args) {
		// 배열의 단점 : 고정된 크기, 같은 타입만 모을 수 있음
		// ArrayList : 가변 크기, 다른 타입들도 넣을 수 있음
		ArrayList list = new ArrayList();
		list.add("홍길동");
		// Object <-- String
		// 큰 <-- 작 (자동형변환, up casting, 업캐스팅)
		
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size());
		
		String name = (String)list.get(0);
		// String <-- Object
		// 작 <-- 큰 (강제형변환, down casting, 다운캐스팅)
		
		// int(기본형) <-- Integer(클래스) <-- Object
		//          <--> 자동형변환
		// Integer, Double, Boolean, Character
		// 기본형과 관련된 처리를 하기위해 부품으로 크게 만들어놨음
		// 기본형 + 포장 -> 포장클래스 (Wrapper 클래스)
		// 기본형과 포장클래스 간에는 자동변환이 가능
		int age = (int)list.get(1);
		// 원래 int가 아니라 Integer가 돼야하는데
		// auto-unboxing이 되어서 int로 적어줘도 됨
		double eye = (double)list.get(2);
		boolean food = (boolean)list.get(3);
		JButton b = (JButton)list.get(4);
		
		// 클래스 간의 상속관계만 참조형 사용 가능
	}

}
