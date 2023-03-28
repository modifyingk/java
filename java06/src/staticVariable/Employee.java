package staticVariable;

public class Employee {
	String name;
	int age;
	char gender;
	static int num;
	static int total_age;
	
	public Employee(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		num++;
		total_age += age;
	}
	
	public static double avg() {
		return total_age / (double)num;
	}

	@Override
	public String toString() {
		return "Employee [이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + "]";
	}
	
}
