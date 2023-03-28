package inheritance;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "홍길동";
		emp1.address = "서울";
		emp1.salary = 3000000;
		System.out.println(emp1);
		
		Manager m = new Manager();
		m.name = "김매니저";
		m.address = "부산";
		m.salary = 3500000;
		m.bonus = 300000;
		System.out.println(m);
		m.test();
	}

}
