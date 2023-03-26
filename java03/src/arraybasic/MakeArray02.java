package arraybasic;

public class MakeArray02 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		System.out.println("num의 주소 >> " + num);
		
		num[0] = 100;
		num[1] = 200;
		
		// for-each : 하나씩 처음부터 뒤로가면서 꺼내오는 반복문
		// 출력용
		for (int x : num) {
			System.out.println(x);
		}
		
		// c타입의 반복문 (i는 index 역할)
		// 입/출력용
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
