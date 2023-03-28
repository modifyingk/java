package constructor;

public class AssembleCom {

	public static void main(String[] args) {
		Computer c1 = new Computer("GAMSUNG", 1000000, 21);
		System.out.println(c1.company);
		System.out.println(c1.price);
		System.out.println(c1.size);
		
		Computer c2 = new Computer("NG", 1500000, 22);
		System.out.println(c2.company);
		System.out.println(c2.price);
		System.out.println(c2.size);
		
		// Computer 클래스에 toString() 메서드를 생성해주면
		// 주소를 print할 때 toString() 메서드가 자동 호출되어
		// return한 String을 주소 대신 프린트해줌
		// return한 String은 주소가 가리키는 힙영역의 멤버변수값들
		System.out.println(c1);
		System.out.println(c2);
	}

}
