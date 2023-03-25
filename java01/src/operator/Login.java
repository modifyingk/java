package operator;

public class Login {

	public static void main(String[] args) {
		int id = 1111;
		int pw = 2222;
		
		int id2 = 1111;
		int pw2 = 2222;
		
		// 예약어 : 문법으로 쓰려고 미리 만들어놓은 단어  -> ex) if
		if (id == id2 && pw == pw2) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}

}
