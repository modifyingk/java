package inheritance;

public class UsePerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		Man m = new Man();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		Superman sMan = new Superman();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.fly();		// Superman
		sMan.run();		// Man
		sMan.eat();		// Person
		sMan.sleep();	// Person
		
		Wonderwoman wWoman = new Wonderwoman();
		wWoman.gender = "여자";
		wWoman.name = "스칼렛";
		System.out.println(wWoman);
		wWoman.fight();
		wWoman.dance();
		wWoman.eat();
		wWoman.sleep();
	}

}
