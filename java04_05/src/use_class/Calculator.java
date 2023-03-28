package use_class;

import make_class.Calculate;

public class Calculator {

	public static void main(String[] args) {
		Calculate cal = new Calculate();
		int result = cal.add(200, 100);
		double result2 = cal.add(100, 22.2);
		double result3 = cal.add(11.1, 22.2);
		String result4 = cal.add("ok", 100);
		
		int result5 = cal.multi(3000, 4);
		// double result6 = cal.div(result5, 4);
		cal.div(result5, 4);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		// System.out.println(result6);
	}

}
