package use_class;

import make_class.Account;

public class MyAccount {

	public static void main(String[] args) {
		Account act1 = new Account();
		act1.name = "홍길동";
		act1.accountName = "튼튼적금";
		act1.money = 1000;
		act1.deposit();
		act1.withdraw();
		
		Account act2 = new Account();
		act2.name = "박길동";
		act2.accountName = "튼튼예금";
		act2.money = 2000;
		act2.deposit();
		act2.withdraw();
		
		Account act3 = new Account();
		act3.name = "홍기사";
		act3.accountName = "다음적금";
		act3.money = 2000;
		act3.deposit();
		act3.withdraw();
	}

}
