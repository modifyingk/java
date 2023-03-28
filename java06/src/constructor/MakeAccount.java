package constructor;

public class MakeAccount {

	public static void main(String[] args) {
		Account dad = new Account("홍길동", "650505", 10000);
		System.out.println(dad.name);
		System.out.println(dad.ssn);
		System.out.println(dad.money);
	}

}
