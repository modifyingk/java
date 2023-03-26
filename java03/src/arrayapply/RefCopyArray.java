package arrayapply;

public class RefCopyArray {

	public static void main(String[] args) {
		// 참조형 복사(주소가 복사, 얕은 복사)
		int[] n1 = {100, 200, 300};
		int[] n2 = n1;
		int[] n3 = n1.clone();
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("================");
		System.out.println("값 변경 전");
		System.out.println("----------------");
		
		// n1 값 print
		System.out.print("n1 : ");
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		// n2 값 print
		System.out.print("n2 : ");
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n2[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		// n3 값 print
		System.out.print("n3 : ");
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n3[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("================");
		System.out.println("값 변경 후");
		System.out.println("----------------");
		
		// n2 값 변경 -> n1 값도 같이 변경됨
		n2[0] = 555;
		n3[0] = 999;
	
		System.out.print("n1 : ");
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i]);
			System.out.print(" ");
		}
		
		System.out.println();

		System.out.print("n2 : ");
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n2[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		
		System.out.print("n3 : ");
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n3[i]);
			System.out.print(" ");
		}
	}

}
