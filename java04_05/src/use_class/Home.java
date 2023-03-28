package use_class;

import make_class.Bricks;

public class Home {

	public static void main(String[] args) {
		// 모든 부품은 ram에 준비, 저장되어있어야함
		Bricks brick1 = new Bricks();
		
		brick1.x = 50;
		brick1.y = 50;
		brick1.stack();
		
		// 주소만 있으면 변수, 메서드에도 접근 가능
		// 현재는 brick1에 주소가 들어있음

		Bricks brick2 = new Bricks();
		
		brick2.x = 150;
		brick2.y = 150;
		brick2.stack();
		
		System.out.println(brick1);
		System.out.println(brick2);
		
		System.out.println(brick1.x);
		System.out.println(brick1.y);
	}

}
