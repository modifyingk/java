package make_class;

public class Account {
	public String name;
	public String accountName;
	public int money;
	
	public void deposit () {
		System.out.println(name + "님이 " + accountName + "에 " + money + "원을 입금하였습니다.");
	}
	
	public void withdraw () {
		System.out.println(name + "님이 " + accountName + "에서 " + money + "원을 출금하였습니다.");		
	}
	
}
