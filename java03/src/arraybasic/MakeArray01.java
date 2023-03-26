package arraybasic;

public class MakeArray01 {

	public static void main(String[] args) {
		int[] s = {1, 2, 3, 4, 5, 6, 7};
		// 변수의 개수 -> 9개
		System.out.println("s에 저장된 주소 >> " + s);
		System.out.println(s[0]);
		System.out.println(s[2]);	// 3번째에 들어있는 값
		System.out.println(s[5]);	// 6번째에 들어있는 값
		System.out.println(s.length);
		
		int[] s2 = new int[5];
		// 변수의 개수 -> 값 5개, s2, length -> 7개
		System.out.println("s2에 저장된 주소 >> " + s2);
		System.out.println(s2.length);
		System.out.println(s2[0]);
		// 쓰레기값인데 출력 결과는 0
		// -> 배열은 자동으로 초기화해줌
		// int -> 0, double -> 0.0, boolean -> false
		
		// 배열의 각 인덱스에 값 대입
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		s2[3] = 400;
		s2[4] = 500;
		
		System.out.println(s2[0]);
		System.out.println(s2.length);
		System.out.println(s2[s2.length - 1]);
	}

}
