package staticVariable;

public class Company {

	public static void main(String[] args) {
		Employee work1 = new Employee("홍길동", 25, '여');
		Employee work2 = new Employee("김길동", 24, '남');
		Employee work3 = new Employee("송길동", 26, '여');
		
		System.out.println("회사의 직원 수는 " + Employee.num + "명");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("회사 직원의 평균 나이는 " + Employee.avg() + "세");
	}

}
