package use_class;

import make_class.Dog;
import make_class.Phone;

public class MyRoom {

	public static void main(String[] args) {
		// 전화기 하나 생성
		Phone p1 = new Phone();
		
		// p1은 참조형 변수(주소)
		System.out.println(p1);
		
		p1.size = 11;
		p1.speaker = "Banana사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		
		p1.call();
		p1.picture();
		
		System.out.println("----------------");
		
		// 전화기 하나 추가
		Phone p2 = new Phone();
		p2.size = 10;
		p2.speaker = "Grape사";
		
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		p2.call();
		p2.picture();

		System.out.println("----------------");
		
		// 강아지 한 마리 생성
		Dog d1 = new Dog();
		d1.breed = "Retriever";
		d1.color = "Golden";
		System.out.print(d1.color);
		System.out.println(d1.breed);
		d1.bark();
		d1.wag();
	}

}
