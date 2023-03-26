package practice;

public class Practice03 {

	public static void main(String[] args) {
		int a = 100;	// 4개
		byte b =50;	// 1개
		a = b;	// int <---byte
		// 타입변환 (형변환)
		// 큰공간 <-- 작은 공간데이터 (자동 형변환)
		
		// int c = 200;	// 127을 넘은 숫자 -> 오류
		int c = 100;
		b = (byte)c;	// -128~127 사이의 숫자만 가능
		// 작은 공간 <-- 큰 공간 데이터 (강제 형변환)
		// 작은 공간에 넣을 때는 큰 거를 잘라서 넣어야함
		// (작은공간이름)변수;
	
		// 조심할 것! 항상 들어갈 수는  없음 
		// * 작은 공간에 들어갈 수 있는 범위여야함 !!
	}

}
