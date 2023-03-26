package arraybasic;

public class ArrayBasic01 {

	public static void main(String[] args) {
		// - 저장될 데이터를 미리 알고 있는 경우
		int[] answer = {1, 1, 2, 3};
		// int[] : int 데이터가 무더기로 저장된 위치(주소)
		// answer이라는 변수 : 주소가 저장
		// {1, 1, 2, 3} : 무더기 영역에 저장된 정수 데이터들
		
		System.out.println(answer);
		
		int[] myanswer = {1, 2, 4, 3};
		
		// - 저장될 데이터를 처음에 모르고 있다가 나중에 넣을 경우
		// 값은 모르겠고 공간만 만들어둠
		int[] space = new int[1000];	// 타입 지정해서 만듦
	}

}
