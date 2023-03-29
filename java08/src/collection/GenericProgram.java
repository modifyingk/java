package collection;

import java.util.ArrayList;

public class GenericProgram {
// generic == general <--> specific, special
	public static void main(String[] args) {
		// 클래스를 만들 때 데이터 타입을 정하지 않고
		// 일반적인(특정하지 않은) 형태로 만들어놓음
		// generic program은 객체 생성 시 데이터타입을 정할 수 있음
		ArrayList<String> list = new ArrayList<>();
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		System.out.println(list2);
	}

}
