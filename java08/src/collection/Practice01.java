package collection;

import java.util.HashMap;

public class Practice01 {

	public static void main(String[] args) {
		HashMap customer = new HashMap();
		customer.put(100, "김데이");
		customer.put(200, "김사전");
		customer.put(300, "김구조");
		customer.put(400, "김자료");
		System.out.println(customer);
		
		customer.remove(200);
		customer.replace(300, "김충성");
		System.out.println(customer);
	}

}
